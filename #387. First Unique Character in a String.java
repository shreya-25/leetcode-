class Solution
{
    public int firstUniqChar(String s) 
    {
        int flag=0;char[] ch = s.toCharArray(); 
        if(s.length()==1)
            return 0;
        if(s.length()==0)
            return -1;
        for(int i=0;i<ch.length-1;i++)
        {  
            if(ch[i]!='@')
            {
               for(int j=i+1;j<ch.length;j++)
               { 
                  if(ch[i]==ch[j])
                  {
                     flag=1;
                     ch[j]='@';
                  }
               }
               if(flag==0)
                  return i;
            }
            flag=0;
        }
        if(ch[ch.length-1]!='@')
             return ch.length-1;
        return -1;
    }
}
