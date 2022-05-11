class Solution {
    public int bitwiseComplement(int n) {
        int pow=1;
        int res=0;
        if(n==0)
            return 1;
        while(n>0)
        {
            int bit=n&1^1;
            n=n>>1;
            res+=(bit*pow);
            pow=pow<<1;
        }
        return res;
    }
}
