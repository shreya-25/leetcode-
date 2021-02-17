class Solution {
    public int lengthOfLongestSubstring(String s) {
      HashMap<Character, Integer> set= new HashMap<Character, Integer>();
      int l=0,r=0,max=0;
      while(r<s.length())
      {
          if(set.isEmpty())
              set.put(s.charAt(r),r);
          else
          {
              if(set.containsKey(s.charAt(r)))
              {
                  if(set.get(s.charAt(r))<l)
                      set.put(s.charAt(r),r);
                  else
                  {
                      l=set.get(s.charAt(r))+1;
                   set.put(s.charAt(r),r);
                  }
              }
              else
              {
                  set.put(s.charAt(r),r);
              }
          }
          if((r-l+1)>max)
              max=r-l+1;
          r++;
      }
        return max;
    }
}
