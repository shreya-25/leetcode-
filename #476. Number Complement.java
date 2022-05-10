class Solution {
    public int findComplement(int num) {
        int res=0;
        int i=0;
        while(num>0)
        {
            int bit=num&1;
            num=num>>1;
            if(bit==0)
                res+= (int)Math.pow(2,i);
            i++;
            
        }
        return res;
        
    }
}
