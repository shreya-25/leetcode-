class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
       ArrayList<Integer>res=new ArrayList<Integer>();
        HashMap<Integer,ArrayList<Integer>>map= new HashMap<>();
        for(int i=0;i<=10001;i++)
        {
            map.put(i,new ArrayList<>(Arrays.asList(1)));
            for(int j=2;j<=9;j++)
            {
                if(i%j==0)
                    map.get(i).add(j);
            }
        }
        int flag=1;
        for(int i=left;i<=right;i++)
        {
            int temp=i;
            while(temp>0)
            {
                if(!map.get(i).contains(temp%10))
                    flag=0;
                temp=temp/10;
            }
            if(flag==1)
                res.add(i);
            else
                flag=1;
        }
        return res;
    }
}
