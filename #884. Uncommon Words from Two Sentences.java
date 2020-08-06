class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        Map<String,Integer> map=new HashMap<>();
        String arr[]=A.split(" ");
        ArrayList<String>ans=new ArrayList<String>();
        for(String s:arr)
            map.put(s,map.getOrDefault(s,0)+1);
        String arr1[]=B.split(" ");
        for(String s:arr1)
            map.put(s,map.getOrDefault(s,0)+1);
        for(String s:map.keySet()){
            if(map.get(s)==1)
                ans.add(s);}
        String res[]=new String[ans.size()];
        for(int i=0;i<ans.size();i++)
            res[i]=ans.get(i);
        return res;
    }
}
