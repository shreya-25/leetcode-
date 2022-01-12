class Solution {
    public int xorOperation(int n, int start) {
        int zor=0;
        for(int i=0;i<n;i++)
        {
            zor^=start+(2*i);
        }
        return zor;
    }
}
