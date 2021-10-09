class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        int copy[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
            copy[i]=arr[i];
        Arrays.sort(copy);
        int c=1;
        for(int i=0;i<copy.length;i++)
        {
            if(i==0)
                map.put(copy[0],1);
            else if(copy[i]==copy[i-1] )
                continue;
            else
                map.put(copy[i],++c); 
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}
