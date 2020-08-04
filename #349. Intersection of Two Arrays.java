class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       ArrayList<Integer>al=new ArrayList<Integer>();
       ArrayList<Integer>res=new ArrayList<Integer>();  
       for(int i=0;i<nums1.length;i++)
            al.add(nums1[i]);
       for(int i=0;i<nums2.length;i++)
       {
            if(al.contains(nums2[i])&&!res.contains(nums2[i]))
                res.add(nums2[i]);
       }
       int arr[]=new int[res.size()];
       for(int i=0;i<arr.length;i++)
            arr[i]=res.get(i);
       return arr;
    }
}
