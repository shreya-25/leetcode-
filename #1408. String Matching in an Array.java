class Solution 
{
    public List<String> stringMatching(String[] words) 
    {
        Set<String>al=new HashSet<String>();
        ArrayList<String>al1=new ArrayList<String>();
        for(int i=0;i<words.length-1;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                if(words[i].length()!=words[j].length())
                {
                      boolean check=find(words[i],words[j]);
                      if(check==true)
                      {
                          if(words[i].length()>words[j].length())
                              al.add(words[j]);
                          else
                             al.add(words[i]); 
                      }
                }
            }
        }
        for(String ch:al)
            al1.add(ch);
        return al1;
    }
    public boolean find(String s1,String s2)
    {
        if(s1.length()<s2.length())
        {
            String temp=s2;
            s2=s1;
            s1=temp;
        }
        for(int i=0;i<s1.length()-s2.length()+1;i++)
        {
            if(s1.charAt(i)==s2.charAt(0))
            {
                if(s1.substring(i,i+s2.length()).equals(s2))
                {
                    return true;
                }
            }
        }
        return false;
    }
}
