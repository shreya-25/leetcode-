class Solution {
    public String reverseOnlyLetters(String S) {
       Stack<Character>st=new Stack<Character>();
        String rev="";
        for(int i=0;i<S.length();i++)
        {
            if((S.charAt(i)>='a'&&S.charAt(i)<='z')||(S.charAt(i)>='A'&&S.charAt(i)<='Z'))
               st.push(S.charAt(i));
        }
        for(int i=0;i<S.length();i++)
        {
            if((S.charAt(i)>='a'&&S.charAt(i)<='z')||(S.charAt(i)>='A'&&S.charAt(i)<='Z'))
               rev+=st.pop();
            else
               rev+=S.charAt(i);
        }
        return rev;       
    }
}
