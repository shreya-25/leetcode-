class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return"";
        Comparator<String> cp=new Comparator<String>()
        {
            @Override
            public int compare(String a, String b)
            {
               if(a.length()>b.length())
                   return 1;
                else if(a.length()<b.length())
                    return -1;
                else
                    return 0;
            }
        };
            Arrays.sort(strs,cp);
        String s="";boolean flag=true;
        for(int j=0;j<strs[0].length();j++)
        {
            for(int i=1;i<strs.length;i++)
            {
                 if(strs[0].charAt(j)!=strs[i].charAt(j))
                 {
                     flag=false;
                     break;
                 }
            }
            if(flag==false)
                break;
            else
                s=s+strs[0].charAt(j); 
        }
        return s;
    }
}
