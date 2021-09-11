class Solution {
    public int minDeletionSize(String[] strs) {
        int c=0;
        char arr[]=new char[strs.length];
        char arr_check[]=new char[strs.length];
        for(int i=0;i<strs[0].length();i++)
        {
            for(int j=0;j<strs.length;j++)
            {
                arr[j]=strs[j].charAt(i);
                arr_check[j]=strs[j].charAt(i);
            }
            Arrays.sort(arr);
            boolean ans = Arrays.equals(arr, arr_check);
            if(!ans)
                c++;
        }
        return c ;
    }
}
