class RangeFreqQuery {
    HashMap<Integer,ArrayList<Integer>> map= new HashMap<Integer, ArrayList<Integer>>();
    public RangeFreqQuery(int[] arr) {
        
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
                map.get(arr[i]).add(i);
            else
            {
                ArrayList<Integer>al=new ArrayList<Integer>();
                al.add(i);
                map.put(arr[i],al);
            }
        }
       // System.out.println(map);
    }
    
    public int query(int left, int right, int value)
    {
       if(!map.containsKey(value))
           return 0;
        int pos_left=binary_left(map.get(value),left,right);
        int pos_right=binary_right(map.get(value),left,right);
        if(pos_left==-1 || pos_right==-1)
            return 0;
        System.out.println(pos_left+" "+pos_right);
        return pos_right-pos_left+1;
       
    }
    public int binary_left(ArrayList<Integer> al , int left, int right)
    {
        int i=0,j=al.size()-1,pos_left=-1;
        while(i<=j)
        {
            int mid= i+(j-i)/2;
            // if(al.get(mid)==left) return mid;
            if(al.get(mid)>=left)
            {
                j=mid-1;
                pos_left=mid;
            }
            else
                i=mid+1;
        }
        return pos_left;
        
    }
     public int binary_right(ArrayList<Integer> al , int left,int right)
    {
        int i=0,j=al.size()-1,pos_right=-1;
        while(i<=j)
        {
              int mid= i+(j-i)/2;
            // if(al.get(mid)==right) return mid;
            if(al.get(mid)<=right)
            {
                i=mid+1;
                pos_right=mid;
            }
            else
                j=mid-1;
        }
        return pos_right;
    }
}

/**
 * Your RangeFreqQuery object will be instantiated and called as such:
 * RangeFreqQuery obj = new RangeFreqQuery(arr);
 * int param_1 = obj.query(left,right,value);
 */
