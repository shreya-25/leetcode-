class Solution {
    public int maximum69Number (int num) {
        String s=Integer.toString(num);
        String res="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='6')
            {
                res=s.substring(0,i);
                res+='9';
                res+=s.substring(i+1);
                break;
            }
        }
        if(res.length()==0)
            return Integer.parseInt(s);
        return Integer.parseInt(res);
    }
}
