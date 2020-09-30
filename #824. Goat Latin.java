class Solution {
    public String toGoatLatin(String S) {
        S+=" "; String word="";int prev=0;String suf="";
        StringBuilder rev= new StringBuilder();
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)==' ')
            {
                word=S.substring(prev,i);
                suf+="a";
                if(word.charAt(0)=='a'||word.charAt(0)=='A'||word.charAt(0)=='e'||word.charAt(0)=='E'||word.charAt(0)=='i'||word.charAt(0)=='I'||word.charAt(0)=='o'||word.charAt(0)=='O'||word.charAt(0)=='u'||word.charAt(0)=='U')
                {
                    rev.append(word);
                    rev.append("ma");
                    rev.append(suf);
                    rev.append(" ");
                    
                }
                else
                {
                    rev.append(word.substring(1));
                    rev.append(word.charAt(0));
                    rev.append("ma");
                    rev.append(suf);
                    rev.append(" ");
                }
                prev=i+1;
            }
        }
        String ans=rev.toString();
        ans=ans.trim();
        return ans;
    }
}
