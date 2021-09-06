class Solution {
    public String addBinary(String a, String b) {
        char carry='0';
        String temp="";
        int i=a.length(),j=b.length();
        int diff=Math.abs(i-j);
        if(i<j)
        {
          for(int k=0;k<diff;k++)  
              temp+='0';
          temp+=a;
          a=temp;
        }
        else
        {
          for(int k=0;k<diff;k++)  
              temp+='0';
          temp+=b;
          b=temp;  
        }
        i=a.length();
        StringBuilder str= new StringBuilder("");
        while(i!=0 )
        {
            int count_0=0, count_1=0;
            if(carry=='1')
                count_1++;
            if(a.charAt(i-1)=='1')
                count_1++;
            if(b.charAt(i-1)=='1')
                count_1++;
            if(count_1==0)
            {
               str.append('0');
               carry='0';
            }
            else if(count_1==1)
            {
               str.append('1');
                carry='0';
            }
            else if(count_1==2)
            { 
               str.append('0'); 
               carry='1';
            }
            else
            { 
                str.append('1'); 
                carry='1';
            }
            i--; 
        }
        if(carry=='1')
            str.append('1');
        str=str.reverse();
        return str.toString();
    }
}
