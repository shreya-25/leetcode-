public class Solution 
{
    // you need to treat n as an unsigned value
    public int hammingWeight(int n)
    {
        int c=Integer.bitCount(n); // bitcount returns the no of ones of a binary value
        return c;
    }
}
