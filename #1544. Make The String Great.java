class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<Character>(); 
        StringBuilder ans=new StringBuilder();
        for(char ch:s.toCharArray())
        {
            if(!stack.isEmpty()&&Math.abs(ch-stack.peek())==32)
                stack.pop();
            else
                stack.push(ch);
        }
        for(char ch:stack)
        {
            ans.append(ch);
        }
        return ans.toString();
    }
}
