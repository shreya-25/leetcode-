class Solution {
    public int dominantIndex(int[] nums) {
        if(nums.length==1)
            return 0;
        int pos=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>nums[pos])
            {
                pos=i;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(i!=pos && (nums[i]*2>nums[pos]))
                return -1;
          
        }
        return pos;
    }
}
