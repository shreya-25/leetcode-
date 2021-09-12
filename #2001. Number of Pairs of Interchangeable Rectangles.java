class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        long c=0;
        HashMap<Double,Long> map=new HashMap<Double,Long>();
        for(int i=0;i<rectangles.length;i++)
        {
                double wid_ht_ratio_1= (double) rectangles[i][0]/rectangles[i][1];
                map.put(wid_ht_ratio_1,map.getOrDefault(wid_ht_ratio_1,0L)+1);
        }
        for(long i:map.values())
        {
            c+=(i *(i-1))/2;
        }
        return c;
    }
}
