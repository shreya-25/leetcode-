class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> map1= new HashMap<String,Integer>();
        HashMap<String,Integer> map2= new HashMap<String,Integer>();
        for(String s:words1)
        {
            if(map1.containsKey(s))
                map1.put(s,map1.getOrDefault(s,0)+1);
            else
                map1.put(s,1);
        }
         for(String s:words2)
        {
            if(map2.containsKey(s))
                map2.put(s,map2.getOrDefault(s,0)+1);
            else
                map2.put(s,1);
        }
        int count=0;
        for(String s:map1.keySet())
        {
            if(map1.get(s)==1)
            {
                if(map2.containsKey(s) && map2.get(s)==1)
                    count++;
            }
        }
        return count;
    }
}
