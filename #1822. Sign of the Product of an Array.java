class Solution {
    public int arraySign(int[] nums) {
        int neg=1;
        for(int i:nums)
        {
            if(i<0)
                neg*=-1;
            if(i==0)
            {
                neg=0;
                break;
            }
        }
        return signFunc(neg);
    }
    public int signFunc(int neg)
    {
        if(neg>0)
            return 1;
        else if(neg<0)
            return -1;
        return 0;
    }
}
