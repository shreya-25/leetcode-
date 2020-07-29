class Solution {
    public void rotate(int[] nums, int k) {
        if(k<=nums.length)
        {
            reverse(0,nums.length-1,nums);
            reverse(0,k-1,nums);
            reverse(k,nums.length-1,nums);
        }
        else
        {
            k=k%nums.length;
            reverse(0,nums.length-1,nums);
            reverse(0,k-1,nums);
            reverse(k,nums.length-1,nums);
        }
        }
        public int[] reverse(int i,int j,int []arr)
        {    int temp=0;
             while(j>i)
             {
                temp= arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j--;
                i++;
             }
            
         return arr;
        }
    
}
