class Solution {
    public void reverseString(char[] s) {
        recursion(0,s.length-1,s);
    }
    public void recursion(int left,int right, char s[])
    {
        if(left>right)
            return;
        char temp=s[left];
        s[left]=s[right];
        s[right]=temp;
        recursion(left+1,right-1,s);
    }
}
