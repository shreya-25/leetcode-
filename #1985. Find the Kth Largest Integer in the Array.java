class Solution {   
public String kthLargestNumber(String[] nums, int k) {
        Arrays.sort(nums, (i,j)->(j.length()== i.length()?i.compareTo(j):i.length()-j.length()));
        return nums[nums.length-k];
    }
}
   
