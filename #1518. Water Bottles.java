class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        ArrayList<Integer>al=new ArrayList<Integer>();
        ArrayList<Integer>al1=new ArrayList<Integer>();
        int c=0;
        al.add(numBottles);
        al1.add(0);
        int total;
        while(!al.contains(0))
        {
            total=al.get(c)+al1.get(c);
            al.add((int)total/numExchange);
            al1.add((int)total%numExchange);
            c++;
        }
        int s=0;
        for(int i:al)
            s=s+i;
        return s; 
    }
}
