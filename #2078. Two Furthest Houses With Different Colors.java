class Solution {
    public int maxDistance(int[] colors) {
        int max=0;
        for(int i=0;i<colors.length;i++)
        {
            for(int j=colors.length-1;j>i;j--)
            {
                if(colors[i]!=colors[j])
                {
                    if(Math.abs(j-i)>max)
                        max=Math.abs(j-i);
                    break;
                }
            }
        }
       return max;
    }
}
