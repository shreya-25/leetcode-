class Solution {
    public int numIdenticalPairs(int[] nums) {
        int arr[]=new int[101];
        for(int i:nums)
            arr[i]++;
        int res=0;
        for(int i:arr)
        {
            res+=(i*(i-1))/2;
        }
        return res;
    }
}
