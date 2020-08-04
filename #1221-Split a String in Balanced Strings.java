class Solution {
    public int balancedStringSplit(String s) {
        int bal=0;int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='R')
                bal--;
            else
                bal++;
            if(bal==0)
                c++;
        }
        return c;
    }
}
