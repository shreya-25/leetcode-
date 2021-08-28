class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>al=new  ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            int low=i+1,high=nums.length-1;
            while(high>low)
            {
                if(nums[high]+nums[low] == -nums[i])
                {
                    ArrayList<Integer> temp= new ArrayList<Integer>();
                    temp.add(nums[i]); temp.add(nums[low]); temp.add(nums[high]);
                    if(!al.contains(temp))
                        al.add(temp);
                    low++; high--;
                }
                else if(nums[high]+nums[low] > -nums[i])
                    high--;
                else
                    low++;
                
            }
            
        }
        return al;
    }
}
