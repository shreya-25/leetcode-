class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        Stack<ArrayList<Integer>> st=new Stack<>();
        StringBuilder str=new StringBuilder("");
        int flag=0;
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(arr[i]>0)
            {
                ArrayList<Integer> al=new ArrayList<>(2);
                al.add(i);
                al.add(arr[i]);
                st.push(al);
            }
        }
        while(st.size()>1)
        {
            ArrayList<Integer> temp=st.pop();
            if(temp.get(1)<=repeatLimit && flag==0)
            {
                for(int j=0;j<temp.get(1);j++)
                    str.append((char)(temp.get(0)+97));
                
            }
            else if(temp.get(1)<=repeatLimit && flag==1)
            {
                str.append((char)(temp.get(0)+97));
                int val=temp.get(1);
                temp.set(1,--val);
                ArrayList<Integer> temp1=st.pop();
                if(temp.get(1)!=0)
                   st.push(temp);
                st.push(temp1);
                flag=0;
                
            }
            else if(temp.get(1)>repeatLimit && flag==1)
            {
                str.append((char)(temp.get(0)+97));
                int val=temp.get(1);
                temp.set(1,--val);
                ArrayList<Integer> temp1=st.pop();
                if(temp.get(1)!=0)
                   st.push(temp);
                st.push(temp1);
                flag=0;
                
            }
            else
            {
                 for(int j=0;j<repeatLimit;j++)
                 {
                    str.append((char)(temp.get(0)+97));
                    int val=temp.get(1);
                    temp.set(1,--val);
                 }
                 ArrayList<Integer> temp1=st.pop();
                 if(temp.get(1)!=0)
                    st.push(temp);
                 st.push(temp1);
                 flag=1;
                  
            }
        }
        ArrayList<Integer> temp=st.pop();
        for(int j=0;j<Math.min(temp.get(1),repeatLimit);j++)
        {
            str.append((char)(temp.get(0)+97));
        }
        return str.toString();
    }
}
