class Solution {
    public boolean isPalindrome(int x) {
        int digit=(int)Math.floor(Math.log10(x) + 1);
        if(x<0)
            return false;
        int temp=x;long sum=0;
        while(x>0)
        {
            sum+=(Math.pow(10,--digit)*(x%10));   
            x=x/10;
        }
        if(sum==temp)
            return true;
        return false;
    }
}
