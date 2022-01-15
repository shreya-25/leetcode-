class Solution {
    public String largestOddNumber(String num) {
        int pos=-1;
        for(int i=num.length()-1;i>=0;i--)
        {
            int ch=num.charAt(i)-48;
            if(ch%2!=0)
            {
                pos=i;
                break;
            }
        }
        if(pos==-1)
        return "";
        return num.substring(0,pos+1);
    }
}
