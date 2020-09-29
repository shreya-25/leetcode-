class Solution {
    public String sortString(String s) {
        int map[]=new int[26];
        int c=0; String ans="";
        for(int i=0;i<s.length();i++)
        {
            map[s.charAt(i)-'a']++;
            c++;
        }
        int flag=1;
        while(c!=0)
        {
           if(flag==1)
           {
              for(int i=0;i<26;i++)
              {
                  if(map[i]>0)
                  {
                    ans+=(char)(i+'a');
                    map[i]--;
                    c--;
                  }
               }
               flag=0;
            }
            else
            {
              for(int i=25;i>=0;i--)
              {
                 if(map[i]>0)
                 {
                    ans+=(char)(i+'a');
                    map[i]--;
                    c--;
                 }
               } 
               flag=1;
             }
           }
        return ans;
    }
}
