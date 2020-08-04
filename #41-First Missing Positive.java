class Solution
{
    public int firstMissingPositive(int[] nums) 
    {
        ArrayList<Integer>al=new ArrayList<Integer>();
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            al.add(nums[i]);
            if(nums[i]>max)
                max=nums[i];
        }
          
        for(int i=1;i<=max;i++)
        {
            if(!al.contains(i))
                return i;
        }
        return max+1;
    }
}
