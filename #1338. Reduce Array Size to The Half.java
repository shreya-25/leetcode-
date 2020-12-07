class Solution {
    public int minSetSize(int[] arr) {
        int val=arr.length/2;
        int map[]=new int[100001];
        for(int i=0;i<arr.length;i++)
        {
            map[arr[i]]++;
        }
        Arrays.sort(map);
        int s=0;int c=0;
        for(int i=map.length-1;i>=0;i--)
        {
            if(s>=val)
                break;
              s=s+map[i];
                c++;
            
        }
        return c;
    }
}
