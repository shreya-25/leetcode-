class Solution {
    public String[] divideString(String s, int k, char fill) {
        //String arr[]=new String[s.length()/k +1];
        int c=0;
        if(s.length()%k!=0)
        {
            while(s.length()%k!=0)
            {
                s=s+fill;
            }
        }
        String arr[]=new String[s.length()/k];
       // System.out.println(s);
        for(int i=0;i<=s.length()-k;i+=k)
        {
            if(i==s.length()-k)
                arr[c++]=s.substring(i);
            else
            arr[c++]=s.substring(i,i+k);
        }
       // arr[c++]=s.substring(s.length()-k);
        return arr;
        
    }
}
