class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int ans[]=new int[k];
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer>al=new ArrayList<Integer>();
        for(int i:map.keySet())
            al.add(i);
         Comparator<Integer> cp=new Comparator<Integer>()
        {
            @Override
            public int compare(Integer a, Integer b)
            {
               return(map.get(b)-map.get(a));
            }
        };
        Collections.sort(al,cp);
        int c=0;
        for(int i:al)
        {
            if(k==0) break;
            ans[c++]=i;
            k--;
        }
        return ans;
    }
}
