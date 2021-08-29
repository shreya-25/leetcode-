class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res= new ArrayList<List<String>>();
        HashMap<String,List<String>>map= new HashMap<String,List<String>>();
        for(String i:strs)
        {
            char arr[]=i.toCharArray();
            Arrays.sort(arr);
            String temp= new String(arr);
            if(!map.containsKey(temp)) map.put(temp, new ArrayList<String>());
                map.get(temp).add(i);
        }
        for(List<String> lt:map.values())
            res.add(lt);
        return res;
    }
}
