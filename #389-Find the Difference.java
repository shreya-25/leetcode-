class Solution 
{
    public char findTheDifference(String s, String t) 
    {
        int map1[]=new int[26];
        int map2[]=new int[26];
        char ans1=' ';
        char[] a=s.toCharArray();
        for(char ch:a)
            map1[ch-'a']++;
        char[] b=t.toCharArray();
        for(char ch:b)
             map2[ch-'a']++;
        for(int i=0;i<26;i++)
        {
            if(map2[i]-map1[i]==1)
            {
                int l=i+97;
                ans1=(char)l;
                break;
            }
           
        }
       
     return ans1;
    }
}
