class Solution {
    public int binaryGap(int n) {
        int pos=-1;int c=0;int max=0;
        while(n>0)
        {
            if(n%2==1 && pos==-1)
                pos=c;
            else if(n%2==1)
            {
                if(c-pos >max)
                    max=c-pos;
                pos=c;
            }
            c++;
            n=n/2;
        }
        return max;
    }
}
