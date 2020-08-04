class Solution {
    public String[] findWords(String[] words) {
         HashSet<Character> row1=new HashSet<Character> (Arrays.asList('q','w','e','r','t','y','u','i','o','p'));
         HashSet<Character> row2=new HashSet<Character> (Arrays.asList('a','s','d','f','g','h','j','k','l'));
         HashSet<Character> row3=new HashSet<Character> (Arrays.asList('z','x','c','v','b','n','m'));   
         List<String> res = new ArrayList<>();
        
         for(String word : words){
            String t=word.toLowerCase();
            boolean row1Yes = true, row2Yes = true, row3Yes = true;
            for(char c : t.toCharArray()){
                if(!row1.contains(c)){
                    row1Yes = false;
                }
                if(!row2.contains(c)){
                    row2Yes = false;
                }
                if(!row3.contains(c)){
                    row3Yes = false;
                }
            }
            if(row1Yes || row2Yes || row3Yes){
                res.add(word);
            }
        }
        String ans[]=new String[res.size()];
        for(int i=0;i<res.size();i++)
            ans[i]=res.get(i);
        return ans;
    }
}
