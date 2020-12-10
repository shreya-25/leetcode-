class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0,i=0;int c=0;
        while(i<s.length() && j<t.length())
        {
            if(t.charAt(j)==s.charAt(i))
            {
                c++;
                i++;
                j++;
            }
            else
                j++;
        }
        if(c==s.length())
        return true;
        return false;
    }
}
