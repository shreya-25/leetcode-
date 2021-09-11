class Solution {
    public int findGCD(int[] nums) {
        int max=0,min=10000;
        for(int i:nums)
        {
            if(i>max)
                max=i;
            if(i<min)
                min=i;
        }
        int res= gcd(min,max);
        return res;
    }
    public int gcd(int a,int b)
    {
        if(a%b==0)
            return b;
        return gcd(b,a%b);
    }
}
