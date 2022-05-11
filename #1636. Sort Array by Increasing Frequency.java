class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        ArrayList<Integer>al= new ArrayList<Integer>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
            al.add(i);
        }
        
        Comparator<Integer>cmp= new Comparator<Integer>()
        {
            public int compare(Integer a , Integer b)
            {
                int freq_a=map.get(a);
                int freq_b=map.get(b);
                if(freq_a<freq_b)
                    return -1;
                if(freq_a==freq_b)
                    return b-a;
                return 1;
            }
        };
        Collections.sort(al,cmp);
        for(int i=0;i<al.size();i++)
            nums[i]=al.get(i);
        return nums;
    }
}
