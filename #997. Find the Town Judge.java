class Solution 
{
    public int findJudge(int N, int[][] trust) 
    {
        int mat[][]=new int[N][N];
        int c=0;
        for(int i=0;i<trust.length;i++)
        {
            int row=trust[i][0];
            int col=trust[i][1];
            mat[row-1][col-1]=1;
        }
        for(int i=0;i<mat.length;i++)
        {   c=0;
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]==0)
                    c++;
            }
            if(c==N)
            {
                c=0;
                for(int k=0;k<mat.length;k++)
                {
                    if(mat[k][i]==1)
                        c++;
                }
                if(c==N-1&& mat[i][i]==0)
                    return i+1;
             }
          }
          return -1;
    }
}
