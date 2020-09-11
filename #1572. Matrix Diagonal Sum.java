class Solution {
    public int diagonalSum(int[][] mat) {
        int s=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                if(i==j||(i+j==mat.length-1))
                    s=s+mat[i][j];
            }
        }
       
        return s;
    }
}
