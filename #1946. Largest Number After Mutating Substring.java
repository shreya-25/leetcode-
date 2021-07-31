class Solution {
    public String maximumNumber(String num, int[] change) {
        StringBuilder ans=new StringBuilder(""); 
        StringBuilder ans1=new StringBuilder(""); int flag=0,find=0; int sum=0,sum1=0;
        for(int i=0;i<num.length();i++)
        {
           int x= (int)num.charAt(i)-48;
           if(change[x]>x && flag==0)
           {
               ans.append(change[x]);
               sum+=change[x];
               find=1;
           }
           else
           {
               if(find==1)
                   flag=1;
               ans.append(x);
               sum+=x;
               
           }
        }
        flag=0;find=0;
        for(int i=0;i<num.length();i++)
        {
           int x= (int)num.charAt(i)-48;
           if(change[x]>=x && flag==0)
           {
               ans1.append(change[x]);
               sum1+=change[x];
               find=1;
           }
           else
           {
               if(find==1)
                   flag=1;
               ans1.append(x);
               sum1+=x;
               
           }
        }
        //System.out.println(ans);
        //System.out.println(ans1);
        if(sum1>sum)
          return ans1.toString();
        else
            return ans.toString();
    }
}
