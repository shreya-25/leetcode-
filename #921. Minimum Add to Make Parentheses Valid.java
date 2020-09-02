class Solution {
    public int minAddToMakeValid(String S) {
        Stack<Character>s=new Stack<Character>();
        for(int i=0;i<S.length();i++)
        {
            if(s.isEmpty())
                s.push(S.charAt(i));
            else
            {
                if(S.charAt(i)==')'&&s.peek()=='(')
                    s.pop();
                else
                    s.push(S.charAt(i));
            }
        }
        return s.size();
    }
}
