class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int res[]= new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            int val=find_pts_in_range(points,queries[i]);
            res[i]=val;
        }
        return res;
    }
    public int find_pts_in_range(int points[][], int queries[])
    {
        int c=0;
        for(int i=0;i<points.length;i++)
        {
            double dis=(Math.sqrt((Math.pow((queries[0]-points[i][0]),2)+(Math.pow((queries[1]-points[i][1]),2)))));
            if(dis<=queries[2])
                c++;
        }
        return c;
    }
}
