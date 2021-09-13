class Solution {
    public String truncateSentence(String s, int k) {
        String str[]=s.split(" ",0);
        StringBuilder st=new StringBuilder("");
        for(String i:str)
        {
            if(k!=0)
            {
                st.append(i);
                st.append(" ");
                k--;
            }
            else
                break;
        }
        return st.toString().trim();
        
    }
}
