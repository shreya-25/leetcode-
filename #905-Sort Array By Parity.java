class Solution 
{
    public int[] sortArrayByParity(int[] A)
    {
      int i=0,j=A.length-1,temp=0;
      boolean st,ls;  
      while(i<j)
      {
          st=A[i]%2!=0;
          ls=A[j]%2==0;
          if(st&&ls)
          {
              temp=A[i];
              A[i]=A[j];
              A[j]=temp;
              i++;
              j--;
          }
          else
          {
             if(!st)
                 i++;
              if(!ls)
                  j--;
          }
          
      }
        return A;
    }
}
