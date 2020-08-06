class Solution {
    public int maxNumberOfBalloons(String text) 
    {
        int map[]=new int[26];
        char arr[]=text.toCharArray();
        for(char ch:arr )
            map[ch-'a']++;
        int arr1[]={map[0],map[1],map[13],(int)map[11]/2,(int)map[14]/2};
        Arrays.sort(arr1);
        return arr1[0];
    }
}
