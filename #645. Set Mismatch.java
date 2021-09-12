class Solution {
    public int[] findErrorNums(int[] nums) {
        int res[]= new int[2];
        int map[]=new int[nums.length];
        for(int i:nums)
        {
            map[i-1]++;
            if(map[i-1]==2)
                res[0]=i;
        }
        for(int i=0;i<map.length;i++)
        {
            if(map[i]==0)
            {
                res[1]=i+1;
                break;
            }
        }
        return res;
    }
}
