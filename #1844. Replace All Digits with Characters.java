class Solution {
    public String replaceDigits(String s) {
        char arr[]=s.toCharArray();
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            if(arr[i]>='0'&& arr[i]<='9')
                arr[i]=(char)((int)arr[i-1] + (arr[i]-48));
            ans+=arr[i];
        }
        return ans;
    }
}
