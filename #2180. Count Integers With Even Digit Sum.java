class Solution {
    public int countEven(int num) 
    {
        int res=0;
        for(int i=1;i<=num;i++)
        {
            int val=helper(i);
            if(val%2==0)
                res++;
        }
        return res;
    }
    public int helper(int x)
    {
        int sum=0;
        while(x>0)
        {
            sum+=x%10;
            x=x/10;
        }
        return sum;
    }
}
