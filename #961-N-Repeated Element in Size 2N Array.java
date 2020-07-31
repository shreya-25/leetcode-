class Solution 
{
    public int repeatedNTimes(int[] A) 
    {
        Set<Integer>s=new HashSet();
        for(int i=0;i<A.length;i++)
        {
            if(s.contains(i))
                return i;
            s.add(i);
        }
        return -1;
    }
}
