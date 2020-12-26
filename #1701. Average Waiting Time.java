class Solution {
    public double averageWaitingTime(int[][] customers) {
        int time[]=new int[customers.length];
        double s=0;
        time[0]=customers[0][0]+customers[0][1];
        s=time[0]-customers[0][0];
        for(int i=1;i<customers.length;i++)
        {
            if(customers[i][0]<time[i-1])
            {
                time[i]=time[i-1]+customers[i][1];
                s+=time[i]-customers[i][0];
            }
            else
            {
                time[i]=customers[i][0]+customers[i][1];
                s+=time[i]-customers[i][0];
            }
        }
        return s/customers.length;
    }
}
