class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int res[]=new int[nums1.length+nums2.length];
       int i=0,j=0;int c=0;
        while(i<nums1.length && j<nums2.length)
        {
           if(nums1[i]<nums2[j]) 
           {
               res[c++]=nums1[i];
               i++;
           }
           else
           {
               res[c++]=nums2[j];
               j++;
           }
        }
        while(i<nums1.length)
        {
            res[c++]=nums1[i];
            i++;
        }
        while(j<nums2.length)
        {
            res[c++]=nums2[j];
            j++;
        }
       // for(int k=0;k<res.length;k++)
       //     System.out.println(res[k]);
        if(res.length%2==0)
        {
            //System.out.println(res[(res.length/2)]);
            return (res[res.length/2]+res[(res.length/2)-1])/2.0;
        }
        return res[res.length/2];
    }
}
