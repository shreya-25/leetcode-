class Solution {
    public String removeDuplicates(String S) {
       ArrayList<Character>al=new ArrayList<Character>();
        char arr[]=S.toCharArray();int c=-1;String ans="";
        for(char ch:arr)
        {
            if(al.isEmpty())
            {
              al.add(ch);
                c++;   
            }
        
            else if(al.get(c)==ch)
            {
                al.remove(c);
                c--;
            }
            else
            {
                 al.add(ch);
                c++;
            }
        }
        for(char ch:al)
            ans+=ch;
    return ans;
    }
}
