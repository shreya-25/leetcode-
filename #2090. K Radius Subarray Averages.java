class Solution {
    public int[] getAverages(int[] nums, int k) {
        int ans[]=new int[nums.length];
        Arrays.fill(ans,-1);
        long sum=0;
        if(nums.length>= (2*k)+1)
        {
        for(int i=0;i<=2*k;i++)
            sum+=nums[i];
        ans[k]=(int)(sum/((2*k )+1));
        }
        for(int i=k+1;i<=nums.length-k-1;i++)
        {
            sum=sum-nums[i-k-1]+nums[i+k];
           // System.out.println(sum);
            ans[i]=(int)(sum/((2*k )+1));
        }
        return ans;
    }
}
