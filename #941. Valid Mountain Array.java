class Solution {
    public boolean validMountainArray(int[] arr) {
        int max=arr[0];int maxpos=0;
        if(arr.length<3)
            return false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                maxpos=i;
            }
        }
        if(maxpos==0 || maxpos==arr.length-1)
            return false;
        for(int i=1;i<=maxpos;i++)
        {
            if(arr[i]<=arr[i-1])
                return false;
        }
         for(int i=maxpos+1;i<arr.length;i++)
        {
            if(arr[i-1]<=arr[i])
                return false;
        }
        return true;
    }
}
