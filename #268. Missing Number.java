class Solution {
    public int missingNumber(int[] nums) {
        int n_sum=(nums.length* (nums.length+1))/2;
        int arr_sum=0;
        for(int i:nums)
            arr_sum+=i;
        return n_sum-arr_sum;
    }
}
