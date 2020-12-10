class Solution {
    public int minSteps(String s, String t) {
        int map1[]=new int[26];
        int map2[]=new int[26];
        for(char ch:s.toCharArray())
            map1[ch-'a']++;
        for(char ch:t.toCharArray())
            map2[ch-'a']++;
        int st=0;
        for(int i=0;i<26;i++)
        {
            st=st+Math.min(map1[i],map2[i]);
        }
        return(s.length()-st);
    }
}
