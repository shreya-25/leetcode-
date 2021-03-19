class Solution {
    public int sumOfUnique(int[] nums) 
    {
        int ans=0;
        if(nums.length==0)
            return ans;
        else if(nums.length==1)
            return nums[0];
        else if(nums.length==2)
        {
            if(nums[0]!=nums[1])
                return nums[0]+nums[1];
            else
                return 0;
        }
        else
        {
            Arrays.sort(nums);
            if(nums[0]!=nums[1])
                 ans+=nums[0];
            if(nums[nums.length-2]!=nums[nums.length-1])
                 ans+=nums[nums.length-1];
            for(int i=1;i<nums.length-1;i++)
            {
                 if(nums[i]!=nums[i-1] && (nums[i]!=nums[i+1]))
                       ans+=nums[i];
            }
            return ans;
        }
    }
}
