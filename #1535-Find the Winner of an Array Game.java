class Solution {
    public int getWinner(int[] arr, int k) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        int prev,wincount=0;
        if(k==1)
            return(Math.max(arr[0],arr[1]));
        for(int i=0;i<arr.length;i++)
        {
            al.add(arr[i]);
        }
        prev=al.get(0);
        if(k>arr.length)
        {
            Arrays.sort(arr);
            return(arr[arr.length-1]);
        }
        while(wincount!=k)
        {
            if(al.get(0)>al.get(1))
            { 
                al.add(al.get(1));
                al.remove(al.get(1));
            }
            else
            {
                al.add(al.get(0));
                al.remove(al.get(0));
            }
            if(prev==al.get(0))
                wincount++;
            else{
                wincount=1;
                prev=al.get(0);}
            if(wincount==k)
                return al.get(0);
        }
        return -1;
    }
}
