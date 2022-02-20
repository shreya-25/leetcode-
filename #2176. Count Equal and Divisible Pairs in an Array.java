class Solution {
    public int countPairs(int[] nums, int k) {
        HashMap<Integer, ArrayList<Integer>>map=new HashMap<>();
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
                map.get(nums[i]).add(i);
            else
            {
                map.put(nums[i], new ArrayList<>());
                map.get(nums[i]).add(i);
            }
        }
        for(int i:map.keySet())
        {
            for(int j=0;j<map.get(i).size()-1;j++)
            {
                for(int m=j+1;m<map.get(i).size();m++)
                {
                    if((map.get(i).get(j)*map.get(i).get(m))%k==0)
                    {
                        System.out.println(j+" "+m);
                        c++;
                    }
                }
            }
        }
        return c;
    }
}
