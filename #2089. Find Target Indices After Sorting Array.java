class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer>al=new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
                al.add(i);
        }
        return al;
    }
}
