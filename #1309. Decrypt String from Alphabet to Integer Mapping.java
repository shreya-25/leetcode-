class Solution {
    public String freqAlphabets(String s) {
        int ans=0; String var="";
         for(int i=0;i<s.length();i++)
         {
             if(i<=s.length()-3 && s.charAt(i+2)=='#')
             {
                 ans=Integer.valueOf(s.substring(i,i+2));
                 //System.out.println(ans);
                 var+=(char)(ans-1+'a');
                 i=i+2;
             }
             else
             {
                  ans=Integer.valueOf(s.substring(i,i+1));
                 //System.out.println(ans);
                 var+=(char)(ans-1+'a'); 
             }
                 
         }
        return var;
    }
}
