class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c=0;
        if(flowerbed.length==1 && flowerbed[0]==0)
        {
            if(n==1 || n==0)
                return true;
            return false;
        }
        if(flowerbed[0]==0 && flowerbed[1]==0)
        {
            c++;
            flowerbed[0]=1;
        }
        for(int i=1;i<flowerbed.length-1;i++)
        {
            if(flowerbed[i]==0)
            {
                if(flowerbed[i-1]==0 && flowerbed[i+1]==0)
                {
                    flowerbed[i]=1;
                    c++;
                }
            }
        }
        if(flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0)
        {
            c++;
        }
        if(c>=n)
            return true;
        return false;
    }
}
