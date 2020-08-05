class Solution {
    public boolean isAnagram(String s, String t) {
         int map[]=new int[26]; 
         char arr[]=s.toCharArray();
         for(char ch:arr)
             map[ch-'a']++;
         char arr1[]=t.toCharArray();
         for(char ch:arr1)
             map[ch-'a']--;
         for(int i=0;i<26;i++)
         {
           if(map[i]!=0)
               return false;
         }
        return true;
    }
}
