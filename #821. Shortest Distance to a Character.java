class Solution {
    public int[] shortestToChar(String s, char c) {
        ArrayList<Integer>al=new ArrayList<Integer>();
        int arr[]=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c)
                al.add(i);
        }
        int min_pos=al.get(0),max_pos=al.get(0);
        for(int j=0;j<=min_pos;j++)
                arr[j]=min_pos-j;
        for(int i=1;i<al.size();i++)
        {
            max_pos=al.get(i);
            for(int j=min_pos+1;j<=max_pos;j++)
                arr[j]=Math.min(j-min_pos,max_pos-j);
            min_pos=max_pos;
        }
        if(!al.contains(s.length()-1))
        {
            for(int j=max_pos;j<s.length();j++)
                arr[j]=j-max_pos;
        }
        return arr;
    }
}
