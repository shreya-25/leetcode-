class Solution
{
    public String restoreString(String s, int[] indices) 
    {
       char map[]=new char[s.length()];
        StringBuilder st=new StringBuilder();
       for(int i=0;i<s.length();i++)
       {
           map[indices[i]]=s.charAt(i);
       }
        for(int i=0;i<s.length();i++)
            st.append(map[i]);
        return st.toString();
     }
}
