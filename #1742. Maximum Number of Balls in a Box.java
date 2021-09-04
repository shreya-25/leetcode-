class Solution {
    public int countBalls(int lowLimit, int highLimit) 
    {
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        int max=0;
        for(int i=lowLimit;i<=highLimit;i++)
        {
            int sum=0,temp=i;
            while(temp>0)
            {
                sum+=temp%10;
                temp=temp/10;
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
            if(map.get(sum)>max)
                max=map.get(sum);
        }
       return max; 
    }
}
