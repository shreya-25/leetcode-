class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int arr[][]=new int[rows*cols][2];
        int c=0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
               arr[c++]= new int[]{i,j};
            }
        }
        Comparator<int[]>cmp = new Comparator<int[]>()
        {
            @Override
            public int compare(int a[], int b[])
            {
               int d1= Math.abs(rCenter-a[0]) +Math.abs(cCenter-a[1]);
               int d2= Math.abs(rCenter-b[0]) +Math.abs(cCenter-b[1]);
               return d1-d2;
            }
        };
        Arrays.sort(arr, cmp);
        return arr;
    }
}
