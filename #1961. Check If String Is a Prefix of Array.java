class Solution {
    public boolean isPrefixString(String s, String[] words) {
        int c=0;
        StringBuilder str=new StringBuilder("");
        for(int i=0;i<words.length;i++)
        {
            c+=words[i].length();
            if(c<s.length())
                 str.append(words[i]);
            else if(c==s.length())
            {
                str.append(words[i]);
                if(str.toString().equals(s))
                      return true;
            }
            else 
                return false;
        }
         return false;
                
    }
}
