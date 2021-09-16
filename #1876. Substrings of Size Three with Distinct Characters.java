class Solution {
    public int countGoodSubstrings(String s) {
        HashSet<Character> set= new HashSet<Character>();
        int res=0;
        for(int i=0;i<s.length()-2;i++)
        {
            for(int j=0;j<3;j++)
            {
                set.add(s.charAt(i+j));
            }
            if(set.size()==3)
                res++;
            set.clear();
        }
        return res;
    }
}
