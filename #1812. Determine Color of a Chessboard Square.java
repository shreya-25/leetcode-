class Solution {
    public boolean squareIsWhite(String coordinates) {
        int pos=coordinates.charAt(0)-'a'; 
        pos=pos+1;
        pos+=coordinates.charAt(1)-'0';
        if(pos%2==0)
            return false;
        return true;
    }
}
