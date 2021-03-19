class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int var=0;int ans=0;
        if(ruleKey.equals("type"))
            var=0;
        else if(ruleKey.equals("color"))
            var=1;
        else
            var=2;
        for(int i=0;i<items.size();i++)
        {
            if(items.get(i).get(var).equals(ruleValue))
                ans++;
        }
         return ans;
    }
}
