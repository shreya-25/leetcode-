class Solution {
    public int hammingDistance(int x, int y) {
        int res=x^y; int c=0;
        while(res!=0)
        {
            if(res%2!=0)
                c++;
            res=res>>1;
        }
        return c;
    }
}
