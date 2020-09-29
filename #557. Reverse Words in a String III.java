class Solution {
    public String reverseWords(String s) {
       s=s+" ";StringBuilder rev = new StringBuilder();
        Stack<Character>st=new Stack<Character>();
       for(int i=0;i<s.length();i++)
       {
           //System.out.println(s.substring(i+2,i));
           st.push(s.charAt(i));
           if(st.peek()==' ')
           {
               st.pop();
               while(!st.isEmpty())
               {
                   rev.append(st.pop());
               }
               rev.append(" ");
           }
       }
        String ans = rev.toString();
        ans=ans.trim();
            return ans;
    }
}
