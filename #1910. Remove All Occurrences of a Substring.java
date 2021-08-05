class Solution {
    public String removeOccurrences(String s, String part) {
        Stack<Character>st =new Stack<Character>();
        StringBuilder str=new StringBuilder("");
        for(int i=0;i<s.length();i++)
        {
            st.push(s.charAt(i));
            //System.out.println(st);
            if(st.size()>=part.length())
            {
                int c=part.length();
                str.setLength(0);
                while(c>0)
                {
                   str.append(st.pop());
                   c--;
                    
                }
                if(!(str.reverse().toString().equals(part)))
                {
                    for(int j=0;j<str.length();j++)
                        st.push(str.charAt(j));
                }
            }
        }
        str.setLength(0);
        while(st.size()>0)
           str.append(st.pop());
    
     return str.reverse().toString();
    }
}
