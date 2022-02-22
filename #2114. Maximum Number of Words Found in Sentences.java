class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0,temp=0;
        for(int i=0;i<sentences.length;i++)
        {
            temp=1;
            for(int j=0;j<sentences[i].length();j++)
            {
                if(sentences[i].charAt(j)==' ')
                    temp++;
            }
            if(temp>max)
                max=temp;
        }
        return max;
    }
}
