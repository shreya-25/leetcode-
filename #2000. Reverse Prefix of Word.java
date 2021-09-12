class Solution {
    public String reversePrefix(String word, char ch) {
        int pos=-1;
        StringBuilder str= new StringBuilder("");
        for(int i=0;i<word.length();i++)
        {
            str.append(word.charAt(i));
            if(word.charAt(i)==ch)
            {
                pos=i;
                break;
            }
        }
        if(pos==-1)
            return word;
        str=str.reverse();
        str.append(word.substring(pos+1));
        return str.toString();
    }
}
