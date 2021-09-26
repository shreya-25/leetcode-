class Solution {
    public String customSortString(String order, String s) {
        StringBuilder str=new StringBuilder("");
        HashMap<Character,Integer>map=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
           map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<order.length();i++)
        {
            if(map.containsKey(order.charAt(i)))
            {
                int temp=map.get(order.charAt(i));
                while(temp>0)
                {
                    str.append(order.charAt(i));
                    temp--;
                }
                map.put(order.charAt(i),0);
            }
        }
        for(char ch:map.keySet())
        {
            if(map.get(ch)>=1)
            {
                while(map.get(ch)>0)
                {
                  str.append(ch);
                  map.put(ch,map.getOrDefault(ch,0)-1);  
                }
            }
        }
        return str.toString();
    }
}
