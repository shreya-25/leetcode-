class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer>al=new ArrayList<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;int j=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]>nums2[j])
                j++;
            else if(nums1[i]<nums2[j])
                i++;
            else
            {
                al.add(nums1[i]);
                    i++;
                j++;
            }
        }
        int arr[]=new int[al.size()];
        int c=0;
        for(int k:al)
            arr[c++]=k;
        return arr;
    }
}
