class Solution {
    public int longestPalindrome(String s) {
        int map[]=new int[26]; boolean oddcheck=false;
        int map1[]=new int[26]; 
        char arr[]=s.toCharArray();
        int even=0,odd=0;
        for(char ch:arr)
        {
            if(ch>='a'&&ch<='z')
                map[ch-'a']++;
            else
                map1[ch-'A']++;
        }
        
        for(int i=0;i<map.length;i++)
        {
             if(map[i]%2==0&&map[i]!=0)
                 even=even+map[i];
             if(map[i]%2!=0)
             {
                  oddcheck=true;
                  odd=odd+map[i]-1;
             }
        }
        for(int i=0;i<map1.length;i++)
            {
                if(map1[i]%2==0&&map1[i]!=0)
                    even=even+map1[i];
                if(map1[i]%2!=0)
                {
                    oddcheck=true;
                    odd=odd+map1[i]-1;
                }
            }
        if(oddcheck)
           return (even+odd+1);
       return(even+odd);
            
    }
}
