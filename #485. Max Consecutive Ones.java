class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
                c++;
            if(c>max)
                max=c;
            if(nums[i]==0)
                c=0;
        }
        return max;
    }
}
