class Solution {
    public int[] sortByBits(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++)
        {
            int temp=arr[i];int res=0;
            while(temp>0)
            {
               temp=(temp&(temp-1));
               res++;
            }
            map.put(arr[i],res);
        }
        Comparator<Integer> cp=new Comparator<Integer>()
        {
            @Override
            public int compare(Integer a, Integer b)
            {
               if(map.get(a)==map.get(b))
                   return a-b;
                else
                    return map.get(a)-map.get(b);
            }
        };
            ArrayList<Integer> al=new ArrayList<Integer>();
            for(int i:arr)
                al.add(i);
            Collections.sort(al,cp);
            int ans[]=new int[arr.length];
            int c=0;
            for(int i:al)
                ans[c++]=i;
        return ans;
    }
}
