class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int qarr[]=new int[queries.length];
        int ans[]=new int[queries.length];
        int warr[]=new int[words.length];
        for(int i=0;i<queries.length;i++)
        {
            qarr[i]=checkfreq(queries[i]);
        }
        for(int i=0;i<words.length;i++)
        {
            warr[i]=checkfreq(words[i]);
        }
        for(int i=0;i<qarr.length;i++)
        {
            int c=0;
            for(int j=0;j<warr.length;j++)
            {
                if(qarr[i]<warr[j])
                    c++;
            }
            ans[i]=c;
        }
        return ans;
    }
    public int checkfreq(String s)
    {
        int map[]=new int[26];
        char ch[]=s.toCharArray();
        for(char t:ch)
            map[t-'a']++;
        for(int i=0;i<map.length;i++)
        {
            if(map[i]>0)
                return map[i];
        }
        return 0;
    }
}
