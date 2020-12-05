class Solution 
{
    public double trimMean(int[] arr) 
    {
        int val= (5*arr.length)/100;
        Arrays.sort(arr);
        double s=0;
        for(int i=val;i<arr.length-val;i++)
            s=s+arr[i];
        return (s/(arr.length-2*val));
    }
}
