class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer>set=new HashSet<Integer>();
        for(int i:nums)
        {
            set.add(i);
            if(set.size()>3)
                set.remove(Collections.min(set));
        }
        if(set.size()<3)
                return (Collections.max(set));
         return (Collections.min(set));
    }
}
