class Solution 
{
    public int findComplement(int num) 
    {
        int r,i=0;int s=0;
        while(num!=0)
        {
            r=num%2;
            if(r==0)
                s=s+(int)Math.pow(2,i);
            i++;
            num=num/2;
         }
        return s;
    }
}
