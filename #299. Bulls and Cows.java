class Solution {
    public String getHint(String secret, String guess) {
        int bull=0,cow=0;
        int []secretarr = new int[10];
        int []guessarr = new int[10];
        char c[]=secret.toCharArray();
        for(char ch:c)
            secretarr[(int)ch-48]++;
        char c1[]=guess.toCharArray();
        for(char ch:c1)
            guessarr[(int)ch-48]++;
        for(int i=0;i<guessarr.length;i++)
        {
            if(secretarr[i]==guessarr[i])
                cow+=secretarr[i];
            if((secretarr[i]!=guessarr[i])&&(secretarr[i]>0&&guessarr[i]>0)){
                int diff=Math.abs(secretarr[i]-guessarr[i]);
            cow+=Math.max(secretarr[i],guessarr[i])-diff;
                 
            }
        }
           
        for(int i=0;i<secret.length();i++)
        {
            if(secret.charAt(i)==(guess.charAt(i)))
                bull++;
        }
            cow=cow-bull;
        String ans="";
        ans=ans+bull+"A"+cow+"B";
        return ans;
    }
}
