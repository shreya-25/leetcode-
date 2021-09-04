class Solution {
    public String sortSentence(String s) {
        String arr[]=s.split(" ",0);
        String res[]=new String[arr.length];
        for(String i:arr)
        {
            char ch=i.charAt(i.length()-1);
            res[ch-'1']=i.substring(0,i.length()-1);
        }
        String ans="";
        for(String i:res)
            ans+=i+" ";
        return ans.trim();
    }
}
