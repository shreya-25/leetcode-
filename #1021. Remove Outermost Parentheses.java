class Solution {
    public String removeOuterParentheses(String S) {
       int c=0;int start=0;String ans="";
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='(')
               c++;
            else
                c--;
            if(c==0)
            {
                ans+=S.substring(start+1,i);
                start=i+1;
            }
        }
        return ans;
    }
}
