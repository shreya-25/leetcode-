class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res= new ArrayList<List<Integer>>();
        Arrays.sort(arr);
        int min=arr[1]-arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if((arr[i]-arr[i-1])<min)
                min=arr[i]-arr[i-1];
        }
        for(int i=1;i<arr.length;i++)
        {
            if((arr[i]-arr[i-1])==min)   
            {
               List<Integer> pair=new ArrayList<Integer>();
               pair.add(arr[i-1]);
               pair.add(arr[i]);
               res.add(pair);
            }
        }
        return res;
    }
}
