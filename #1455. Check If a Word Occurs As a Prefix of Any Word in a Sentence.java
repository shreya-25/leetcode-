class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) 
    {
        sentence+=" ";int prev=0;String word="";int wordcross=0;
        int len=searchWord.length();
        for(int i=0;i<sentence.length();i++)
        {
            int flag=0;
            if(sentence.charAt(i)==' ')
            {
                word=sentence.substring(prev,i);
                wordcross++;
                prev=i+1;
            }
            if(word.length()>=len)
            {
                String match= word.substring(0,len);
                if(match.equals(searchWord))
                    return wordcross;
            }
        }
        return -1;
    }
