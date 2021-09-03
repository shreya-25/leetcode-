class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(k==1)
            return 0;
        Arrays.sort(nums);
        int diff=0,min_diff=0;
        diff=nums[k-1]-nums[0];
        min_diff=diff;
        for(int i=1;i<nums.length-k+1;i++)
        {
            diff=nums[i+k-1]-nums[i];
            min_diff=Math.min(min_diff,diff);
        }
        return min_diff;
    }
}
