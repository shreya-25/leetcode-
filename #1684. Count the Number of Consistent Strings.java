class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        char allowed_arr[]= toArray(allowed);
        int c=0;
        
        for(int i=0;i<words.length;i++)
        {
            int flag=0;
            for(int j=0;j<words[i].length();j++)
            {
                if(allowed_arr[(words[i].charAt(j))-97]=='0')
                {
                    flag=1; //not found
                    break;
                }
            }
            if(flag==0)
                   c++;
        }
        
        return c;    
        
    }
    public char[] toArray(String s)
    {
        char arr[]=new char[26];
        Arrays.fill(arr,'0');
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-97]= '1';
        }
        return arr;
    }
}
