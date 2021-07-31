class Solution {
    public int getLucky(String s, int k) {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='s')
                sum+=10;
            else
            {
            int check= ((int)s.charAt(i)-96)%9;
            if(check==0)
                sum+=9;
            else
                sum+=check;
            }   
        }
        k--;
        while(k>0)
        {
            int temp=sum;
            sum=0;
            while(temp>0)
            {
              sum+=temp%10;
              temp=temp/10;   
            }
            k--;
        }
        return sum;
    }
}
