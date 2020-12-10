class Solution {
    public boolean isIsomorphic(String s, String t) {
        Set<Character>st=new HashSet<>();
        char map1[]=new char[128];
        for(int i=0;i<s.length();i++)
        {
            if(map1[(int)s.charAt(i)]=='\u0000')
            {
                if(st.contains(t.charAt(i)))
                   return false;
                 map1[(int)s.charAt(i)]=t.charAt(i);
                st.add(t.charAt(i));
            }
            else
            {
                if((int)map1[s.charAt(i)]==t.charAt(i))
                    continue;
                else
                    return false;
            }
        }
        return true;
        
    }
}
