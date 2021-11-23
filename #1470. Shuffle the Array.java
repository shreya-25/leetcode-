class Solution {
    public int[] shuffle(int[] nums, int n) {
        int res[]=new int[nums.length];
        int c=0;
        for(int i=0;i<n;i++)
        {
            res[c++]=nums[i];
            res[c++]=nums[i+n];
        }
        return res;
    }
}
