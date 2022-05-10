class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer>al= new ArrayList<Integer>();
        for(int i:nums)
            al.add(i);
        
        Comparator<Integer> cmp = new Comparator<Integer>()
        {
            @Override
            public int compare(Integer a, Integer b)
            {
                if(((a&1)==0) && ((b&1)==1))
                    return -1;
                else if((a&1)== (b&1))
                    return 0;
                else
                    return 1;
            }
            
        };
        Collections.sort(al,cmp);
        for(int i=0;i<al.size();i++)
        {
            nums[i]=al.get(i);
        }
        return nums;
    }
}
