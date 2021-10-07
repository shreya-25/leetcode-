class Solution {
    public int findKthLargest(int[] nums, int k) {
        ArrayList<Integer>al= new ArrayList<Integer>();
        for(int i:nums)
            al.add(i);
        Comparator<Integer> cmp=new Comparator<Integer>()
        {
            @Override
            public int compare(Integer a, Integer b)
            {
                return b-a;
            }
        };
        Collections.sort(al,cmp);
        return al.get(k-1);
    }
}
