class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i:stones)
        {
            al.add(i);
        }
        while(al.size()>1)
        {
            Collections.sort(al);
            int a= al.get(al.size()-1);
            int b= al.get(al.size()-2);
            al.remove(al.size()-1);
            al.remove(al.size()-1);
            al.add(a-b);
        }
        return al.get(0);
    }
}
