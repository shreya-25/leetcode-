class Solution {
    public int islandPerimeter(int[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==1)
                { 
                    if(i==0)
                        c++;
                    if(i==grid.length-1)
                        c++;
                    if(j==0)
                        c++;
                    if(j==grid[i].length-1)
                        c++;
                    if(j!=0&& grid[i][j-1]!=1)
                        c++;
                     if(j!=grid[i].length-1&& grid[i][j+1]!=1)
                        c++;
                     if(i!=0&&grid[i-1][j]!=1)
                         c++;
                     if(i!=grid.length-1&&grid[i+1][j]!=1)
                         c++;
                    
                }
            }
        }
        return c;
    }
}
****************************************************************************************************************
solution 2 -
    
class Solution {
    public int islandPerimeter(int[][] grid) {
        int res=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==1)
                {
                    res+=4;
                    if(i!=0 && grid[i-1][j]==1)
                    {
                       res-=2;
                    }
                    if(j!=0 && grid[i][j-1]==1)
                    {
                       res-=2;
                    }
                }
            }
        }
        return res;
    }
}
