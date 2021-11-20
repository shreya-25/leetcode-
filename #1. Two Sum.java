class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[]=new int[2];
       // int temp[]= Arrays.copyOf(nums,nums.length);
       ArrayList<Integer>al=new ArrayList<Integer>();
       for(int i:nums)
           al.add(i);
       int flag=0;
       for(int i=0;i<nums.length;i++)
       {
           if(flag==1)
               break;
           int find= target-nums[i];
           System.out.println(find);
           if(al.contains(find))
           {
               res[0]=i;
               for(int j=i;j<nums.length;j++)
               {
                   if(nums[j]==find && i!=j)
                   {
                       res[1]=j;
                       flag=1;
                       break;
                   }
               }
           }
       }
        return res;
    }
}
