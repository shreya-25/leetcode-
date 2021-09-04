class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer>map=new HashMap<Character,Integer>();
        HashSet<Integer>set=new HashSet<Integer>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i:map.values())
        {
            set.add(i);
        }
        if(set.size()==1)
            return true;
        return false;
    }
}
