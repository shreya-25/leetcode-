class Solution {
    public int fib(int n) {
        int arr[]=new int[31];
        arr[1]=1;arr[2]=1;
        for(int i=3;i<=30;i++)
            arr[i]=arr[i-1]+arr[i-2];
        return arr[n];
    }
}
