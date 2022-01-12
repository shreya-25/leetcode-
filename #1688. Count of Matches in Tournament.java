class Solution {
    public int numberOfMatches(int n) {
        int matches=0;
        while(n>=2)
        {
            matches+=n/2;
            n=n-n/2;
            
        }
        return matches;
    }
}
