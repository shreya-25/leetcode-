class Solution 
{
    public int peakIndexInMountainArray(int[] arr) 
    {
       int max=-1,maxpos=-1;
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]>max)
           {
               max=arr[i];
               maxpos=i;
           }
       }
       return maxpos;
    }
}
