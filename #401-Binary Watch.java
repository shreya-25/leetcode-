class Solution {
    public List<String> readBinaryWatch(int num) {
        ArrayList<String>al=new ArrayList<String>();
        String time;
        for(int hr=0;hr<12;hr++)
        {
            for(int min=0;min<60;min++)
            {
                if(Integer.bitCount(hr)+Integer.bitCount(min)==num)
                {
                    if(min<10)
                        time=hr+":0"+min;
                    else
                        time=hr+":"+min;
                    al.add(time);
                }
            }
        }
        return al;
    }
}
