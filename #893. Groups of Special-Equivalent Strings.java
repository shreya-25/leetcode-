class Solution {
    public int numSpecialEquivGroups(String[] A) {
         Set<String> st= new HashSet();
        for(int i=0;i<A.length;i++)
        {
            int even[]=new int[26];
            int odd[]=new int[26];
            for(int j=0;j<A[i].length();j++)
            {
                if(j%2==0)
                    even[A[i].charAt(j)-'a']++;
                else
                    odd[A[i].charAt(j)-'a']++;
            }
            String val=Arrays.toString(even)+Arrays.toString(odd);
            st.add(val);
        }
        return st.size();
    }
}
