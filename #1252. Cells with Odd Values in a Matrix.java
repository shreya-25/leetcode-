class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int row[]=new int[m+1];
        int col[]=new int[n+1];
        int c=0;
        for(int i=0;i<indices.length;i++)
        {
            row[indices[i][0]]++;
            col[indices[i][1]]++;
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((row[i]+col[j])%2 !=0)
                    c++;
                
            }
        }
        return c;
    }
}
