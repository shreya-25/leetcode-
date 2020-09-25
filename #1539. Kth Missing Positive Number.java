class Solution {
    public int findKthPositive(int[] arr, int k) {
        int map[]=new int[2002];
        int c=0,ans=0;
        for(int i=0;i<arr.length;i++)
        {
            map[arr[i]]=1;
        }
        for(int i=1;i<=2001;i++)
        {
            if(map[i]==0)
                c++;
            if(c==k)
            {
                ans=i;
                break;
            }
        }
        return ans;
    }
}
