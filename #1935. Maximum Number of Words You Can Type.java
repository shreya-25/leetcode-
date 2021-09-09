class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> set= new HashSet<Character>();
        for(int i=0;i<brokenLetters.length();i++)
            set.add(brokenLetters.charAt(i));
        text=text+" ";
        String arr[]=text.split(" ",0);
        int c=0;
        for(String t:arr)
        {
            boolean flag=true;
            for(int i=0;i<t.length();i++)
            {
                if(set.contains(t.charAt(i)))
                {
                    flag=false;
                    break;
                }
            }
            if(flag==true)
                c++;
        }
        return c;
    }
