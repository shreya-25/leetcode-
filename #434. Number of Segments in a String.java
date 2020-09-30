class Solution {
    public int countSegments(String s) {
        s=s.trim();int c=0;
        if(s.length()==0)
            return 0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i) ==' '&&s.charAt(i+1) !=' ')
                c=c+1;
        }
        return(c+1);
    }
}
