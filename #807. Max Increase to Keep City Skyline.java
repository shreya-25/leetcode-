class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
       int arr[][]= new int[grid.length][2];
       for(int i=0;i<grid.length;i++)
       {
           int max=0; int max1=0;
           for(int j=0;j<grid.length;j++)
           {
               if(grid[i][j]>max)
                   max=grid[i][j];
               if(grid[j][i]>max1)
                   max1=grid[j][i];
           }
           arr[i][0]=max;
           arr[i][1]=max1;
       }
       int val=0;
       for(int i=0;i<grid.length;i++)
       {
           for(int j=0;j<grid.length;j++) 
           {
               val+= Math.min(arr[i][0],arr[j][1])-grid[i][j];
           }
       }
        return val;
    }
}
