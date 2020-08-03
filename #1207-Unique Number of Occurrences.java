class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        Set<Integer>s=new HashSet<>();
        for(int i:map.values())
        {
            if(!s.add(i)) // indicating the presence of duplicate values
                return false;
                
            }
        return true;
    }
}
