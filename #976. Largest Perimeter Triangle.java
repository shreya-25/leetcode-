class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer>al=new ArrayList<Integer>();
        al.add(0);
        for(int i=0;i<nums.length-2;i++)
        {
            if(((nums[i]+nums[i+1])>nums[i+2]) && ((nums[i+1]+nums[i+2])>nums[i]) && ((nums[i]+nums[i+2])>nums[i+1]))
            {
                al.add(nums[i]+nums[i+1]+nums[i+2]);
            }
        }
        Collections.sort(al);
        return al.get(al.size()-1);
    }
}
