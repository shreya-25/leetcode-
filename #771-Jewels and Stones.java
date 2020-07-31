class Solution 
{
   public int numJewelsInStones(String J, String S) 
   {
        ArrayList<Character>arr=new ArrayList<Character>();
        int c=0;
        for(int i=0;i<J.length();i++)
        {
            arr.add(J.charAt(i));
        }
        for(int i=0;i<S.length();i++)
        {
            if(arr.contains(S.charAt(i)))
               c++;
        }
    return c;
   }
}
