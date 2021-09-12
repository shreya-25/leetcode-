class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int sum=0;
        Comparator<int[]> cmp=new Comparator<int[]>()
        {
            @Override
            public int compare(int a[] , int b[])
            { 
                return b[1]-a[1];
            }
        };
        Arrays.sort(boxTypes,cmp);
        for(int i=0;i<boxTypes.length;i++)
        {
            if(truckSize==0)
                break;
            if(boxTypes[i][0]<=truckSize)
            {
                sum+=boxTypes[i][0]* boxTypes[i][1];
                truckSize=truckSize-boxTypes[i][0];
            }
            else
            {
                sum+=truckSize*boxTypes[i][1];
                truckSize=0;
            }
        }
        return sum;
    }
}
