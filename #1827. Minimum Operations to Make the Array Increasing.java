class Solution {
    public int minOperations(int[] arr) {
        int c=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<=arr[i-1])
            {
                c+=arr[i-1]-arr[i]+1;
                arr[i]= arr[i-1]+1;
            }
        }
        return c;
    }
}
