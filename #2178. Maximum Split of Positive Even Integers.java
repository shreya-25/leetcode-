class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        
        List<Long> al=new ArrayList<Long>();
        long sum=0;
        if(finalSum==0 || finalSum%2==1)
            return al;
        for(long i=2; ;i+=2)
        {
           sum+=i;
            al.add(i);
           if(sum==finalSum)
                return al;
            if(sum>finalSum)
            {
                al.remove(sum-finalSum);
                return al;
            }
        }
    }
}
