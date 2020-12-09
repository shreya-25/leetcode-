class Solution {
    public String modifyString(String s) {
        char ch[]=s.toCharArray(); String t="";
        if(ch[0]=='?'&& s.length()==1)
            ch[0]='a';
        if(ch[0]=='?'&& ch[1]!='a')
            ch[0]='a';
        if(ch[0]=='?'&& ch[1]=='a')
            ch[0]='b';
        if(ch[s.length()-1]=='?'&& ch[s.length()-2]!='a')
            ch[s.length()-1]='a';
        if(ch[s.length()-1]=='?'&& ch[s.length()-2]=='a')
            ch[s.length()-1]='b';
        for(int i=1;i<=s.length()-2;i++)
        {
            if(ch[i]=='?')
            {
                char sym='a';
                while(ch[i-1]==sym || ch[i+1]==sym)
                    sym++;
                ch[i]=sym;
            }  
        }
        for(char ww:ch)
          t+=ww;  
        return t;
    }
}
