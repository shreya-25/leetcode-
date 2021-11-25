class Solution {
    public int[] plusOne(int[] digits) {
        int carry=1;int flag=0;
        int ans[]=new int[digits.length+1];
        for(int i=digits.length-1;i>=0;i--)
        {
            if((digits[i]+carry)==10)
            {
                if(i==0)
                    flag=1;
                digits[i]=0;
                carry=1;
            }
            else
            {
                digits[i]+=carry;
                carry=0;
            }
        }
        if(flag==0)
        return digits;
        else
        {
            ans[0]=1;
            for(int i=0;i<digits.length;i++)
                ans[i+1]= digits[i];
        }
        return ans;
    }
}
