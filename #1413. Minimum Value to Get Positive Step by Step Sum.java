class Solution {
    public int minStartValue(int[] nums) {
        for(int i=1;;i++)
        {
            int s=i+nums[0];
            if(s<1)
                continue;
            boolean flag=true;
           for(int j=1;j<nums.length;j++)
           {
               s=s+nums[j];
               if(s<1)
               {
                  flag=false;
                  break;
               }
            }
            if(flag==true)
                return i;
        }
    }
}
