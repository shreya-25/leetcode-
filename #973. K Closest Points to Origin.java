class Solution {
    public int[][] kClosest(int[][] points, int K) {
        double arr[]=new double[points.length];
         double map[]=new double[points.length];
        int ans[][]=new int[K][2];
        for(int i=0;i<points.length;i++)
        {
            double dist=Math.sqrt(points[i][0]*points[i][0]+ points[i][1]*points[i][1]);
            arr[i]=dist;
            map[i]=dist;
        }
        Arrays.sort(arr);
        int c=0;
        for(int i=0;i<K;i++)
        {
            for(int j=0;j<map.length;j++)
            {
                if(map[j]==arr[i])
                {
                    map[j]=-9;
                    ans[c][0]=points[j][0];
                    ans[c][1]=points[j][1];
                    c++;
                    break;
                }
            }
        }
        return ans;
    }
}
