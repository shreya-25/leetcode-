class Solution 
{
    public boolean hasAlternatingBits(int n) 
    {
       int r,lt=-1;
        while(n!=0)
        {
            r=n%2;
            if(lt==r)
                return false;
            lt=r;
            n=n/2;
         }
    return true;
    }
}
