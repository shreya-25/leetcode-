class Solution 
{
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        int ans[]=new int[nums1.length];
        Stack<Integer> stack = new Stack<Integer>();
        for(int i:nums2)
            stack.push(i);
        int c=0;
        for(int i:nums1)
        {  
            int len=nums2.length;
            int max=-1;
            while(stack.get(len-1)!=i)
            {
                
                if(stack.get(len-1)>i)
                    max=stack.get(len-1);
                len--;
            }
            ans[c++]=max;
        }
        return ans;
    }
}
