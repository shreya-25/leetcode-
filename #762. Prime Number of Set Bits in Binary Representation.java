class Solution {
    int prime[]=new int[50];
    public int countPrimeSetBits(int left, int right) {
        int res=0;
        fill_prime();
        for(int i=left;i<=right;i++)
        {
            int val=check_bits(i);
            if(prime[val]==1)
                res++;
        }
    return res;
    }
    public void fill_prime()
    {
        Arrays.fill(prime,1);
        prime[0]=0;
        prime[1]=0;
        for(int i=2;i<=7;i++)
        {
            if(prime[i]==1)
            {
               for(int j=2;i*j<50;j++)
               {
                   prime[i*j]=0;
               }
            }
        }
    }
    public int check_bits(int num)
    {
        int c=0;
        while(num>0)
        {
            num=num&(num-1);
            c++;
        }
        return c;
    }
}
