class Solution {
    public long[] sumOfThree(long num) {
        long res[];
        if((num-3)%3==0)
        {
            res=new long[3];
            long val=(num-3)/3;
            res[0]=val;
            res[1]=val+1;
            res[2]=val+2;
            return res;
        }
        res=new long[0];
        return res ;
    }
}
