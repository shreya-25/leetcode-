class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] arr= text.split(" "); 
        ArrayList<String>al=new ArrayList<String>();
        for(int i=0;i< arr.length-2;i++)
        {
            if((arr[i].equals(first)) && (arr[i+1].equals(second)))
                al.add(arr[i+2]);
        }
        String ans[]=new String[al.size()];
        for(int i=0;i<ans.length;i++)
            ans[i]=al.get(i);
        return ans;
    }
}
