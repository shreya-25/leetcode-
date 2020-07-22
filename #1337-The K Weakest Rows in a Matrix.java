class Solution 
{
    public int[] kWeakestRows(int[][] mat, int k) 
    {
        int a[]=new int[k];
        ArrayList<Integer>arr=new ArrayList<Integer>();
        ArrayList<Integer>arr1=new ArrayList<Integer>();
        for(int i=0;i<mat.length;i++)
        { 
          int c=0;
          for(int j=0;j<mat[i].length;j++)
          {
              if(mat[i][j]==1)
                  c++;
              else
                  break;
          }  
        arr.add(c);
        arr1.add(i);
        }
        Comparator<Integer> comp=new Comparator<Integer>(){
        @Override
        public int compare(Integer a, Integer b)
        {
           return arr.get(a)- arr.get(b);
        }
        };
        Collections.sort(arr1, comp);
        for(int i=0;i<k;i++)
            a[i]=arr1.get(i);
        return a;
    }
}
