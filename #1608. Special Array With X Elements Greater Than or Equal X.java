class Solution {
    public int specialArray(int[] nums) {
        int arr[]=new int[1002];
        int map[]=new int[1001];
        for(int i:nums)
            map[i]++;
        arr[1001]=0;
        for(int i=1000;i>=0;i--)
        {
            arr[i]=map[i]+arr[i+1];
        }
        for(int i=0;i<1001;i++)
        {
            if(arr[i]==i)
                return i;
        }
        return -1;
    }
}
