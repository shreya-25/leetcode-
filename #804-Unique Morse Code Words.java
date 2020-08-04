class Solution 
{
    public int uniqueMorseRepresentations(String[] words) 
    {
        String s="";int c=0;
        Set<String> set= new HashSet<String>();
        String arr[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words[i].length();j++)
                s=s+arr[words[i].charAt(j)-'a'];
                if(!set.contains(s))
                {
                    set.add(s);
                    c++;
                }
                s="";
        }
        return c;
    }
}
