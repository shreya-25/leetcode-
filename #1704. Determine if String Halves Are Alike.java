class Solution {
    public boolean halvesAreAlike(String s) {
        int c1=0,c2=0;
        s=s.toLowerCase();
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i'|| s.charAt(i)=='o'||s.charAt(i)=='u')
                c1++;
        }
        for(int i=s.length()/2;i<s.length();i++)
        {
            if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i'|| s.charAt(i)=='o'||s.charAt(i)=='u')
                c2++;
        }
        if(c1==c2)
            return true;
        else
            return false;
    }
}
