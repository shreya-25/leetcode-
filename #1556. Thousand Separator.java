class Solution {
    public String thousandSeparator(int n) {
        String s= Integer.toString(n);
        if(s.length()<=3)
            return s;
        String t="";int c=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            t=s.charAt(i)+t;
            c++;
            if(c==3 && i!=0)
            {
                t='.'+t;
                c=0;
            }
        }
        return t;
    }
}
