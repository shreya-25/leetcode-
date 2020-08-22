class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character>stack=new Stack<Character>();
        for(int i=0;i<S.length();i++)
        {
         if(S.charAt(i)=='#' && !stack.isEmpty())  
             stack.pop();
         else
         {
             if(S.charAt(i)!='#')
                 stack.push(S.charAt(i));
         }
        }
         Stack<Character>stack1=new Stack<Character>();
        for(int i=0;i<T.length();i++)
        {
         if(T.charAt(i)=='#' && !stack1.isEmpty())  
             stack1.pop();
         else
         {
             if(T.charAt(i)!='#')
                 stack1.push(T.charAt(i));
         }
        }
        if(stack.size()!=stack1.size())
            return false;
        else
        {
            while(stack.size()>0)
            {
                if(stack.pop()!=stack1.pop())
                    return false;
            }
        }
        return true;
    }
}
