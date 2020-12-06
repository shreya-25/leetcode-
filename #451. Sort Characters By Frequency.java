class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        ArrayList<Character>al=new ArrayList<Character>();
        for(char i:map.keySet())
            al.add(i);
         Comparator<Character> cp=new Comparator<Character>()
        {
            @Override
            public int compare(Character a, Character b)
            {
               return(map.get(b)-map.get(a));
            }
        };
        Collections.sort(al,cp);
        StringBuilder st=new StringBuilder();
        for(char ch:al)
        {
            while(map.get(ch)!=0)
            {
                st.append(ch);
                map.put(ch,map.getOrDefault(ch,map.get(ch))-1);
            }
        }
        return st.toString();
    }
}
