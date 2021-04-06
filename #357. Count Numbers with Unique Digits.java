class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int sum=1;
        if (n>=0)
            sum=1;
        if(n>=1)
            sum+=9;
        if(n>=2)
            sum+=9*9;
        if(n>=3)
            sum+=9*9*8;
        if(n>=4)
            sum+=9*9*8*7;
        if(n>=5)
            sum+=9*9*8*7*6;
        if(n>=6)
            sum+=9*9*8*7*6*5;
        if(n>=7)
            sum+=9*9*8*7*6*5*4;
        if(n>=8)
            sum+=9*9*8*7*6*5*4*3;
       return sum; 
    }
}
