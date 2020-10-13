class Solution {
    public int maxDepth(String s) {
      Stack<Integer>st=new Stack<Integer>();
        int maxi=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
                st.add(-800);  // -800 is just a random value to denote "(" character.
            else if(s.charAt(i)==')')
            {
                if(st.peek()==-800)
                {
                    st.pop();
                    st.add(1);
                }
                else 
                {
                    while(st.peek()!=-800)
                        maxi=Math.max(maxi,st.pop());
                    st.pop();
                    st.add(maxi+1);
                    maxi=0;
                }
            }
            else
                continue;
        }
        maxi=0;
        while(st.size()!=0)
        {
            maxi=Math.max(maxi,st.pop());
        }
        return maxi;
    }
}
