class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<Integer>(); 
        int sum=0;
        for(String ch:ops)
        {
            if(ch.equals("C"))
            {
             int t= stack.pop();
              sum-=t;
            }
            else if(ch.equals("D"))
            {
                stack.push(stack.peek()*2);
                sum+=stack.peek();
            }
            else if(ch.equals("+"))
            {
                int t=stack.get(stack.size()-1)+stack.get(stack.size()-2);
                stack.push(t);
                sum+=t;
            }
            else
            {
                stack.push(Integer.parseInt(ch));
                sum+=stack.peek();
            }
        }
        return sum;
    }
}
