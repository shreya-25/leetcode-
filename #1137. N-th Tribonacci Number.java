class Solution {
    public int tribonacci(int n) {
       int fibarr[]=new int[38];
        fibarr[0]=0;
        fibarr[1]=1;
        fibarr[2]=1;
        for(int i=3;i<=n;i++)
         fibarr[i]=fibarr[i-3]+fibarr[i-2]+fibarr[i-1];
        return fibarr[n];
    }
}
