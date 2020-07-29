class Solution {
    public int numberOfSteps (int num) {
        int i=0;
        while(num!=0)
        {
        if((num & 1)>0) // condition to check odd number
            num--;
        else
           num=(num >> 1); //to divide a number by two did bitwise right shift
        i++;
        }
        return i;
    }
}
