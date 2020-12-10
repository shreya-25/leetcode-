class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int map1[]=new int[26];
        int map2[]=new int[26];
        for(char ch:ransomNote.toCharArray())
            map1[ch-'a']++;
        for(char ch:magazine.toCharArray())
            map2[ch-'a']++;
        for(int i=0;i<26;i++)
        {
            if(map2[i]<map1[i])
                return false;
        }
        return true;
    }
}
