class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer>al=new ArrayList<Integer>();
        int num1=0,num2=0,c1=0,c2=0;
        for(int i:nums)
        {
            if(num1==i)
            {
                c1++;
            }
            else if(num2==i)
            {
                c2++;
            }
            else if(c1==0)
            {
                num1=i;
                c1++;
            }
            else if(c2==0)
            {
                num2=i;
                c2++;
            }
            else
            {
                c1--;
                c2--;
            }
        }
        c1=0; c2=0;
        for(int i:nums)
        {
            if(i==num1)
                c1++;
            if(i==num2)
                c2++;
        }
        if(c1>(int)(nums.length/3))
            al.add(num1);
        if(c2>(int)(nums.length/3) && num1!=num2)
            al.add(num2);
        
        return al;
    }
}
