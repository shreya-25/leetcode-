/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<TreeNode>();
        ArrayList<String>al=new ArrayList<String>();
        q.add(root);
        q.add(null);
        while(q.size()>0 ||(q.size()==1 && q.peek()!=null))
        {
            TreeNode temp=q.poll();
            if(temp!=null)
            {
                if(temp!=root)
                    al.add(temp.val+"");
                if(temp.val!=-101)
                {
                if(temp.left!=null)
                    q.add(temp.left);
                else
                {
                    TreeNode temp1=new TreeNode(-101);
                    q.add(temp1);
                }
                if(temp.right!=null)
                    q.add(temp.right);  
                else
                {
                    TreeNode temp1=new TreeNode(-101);
                    q.add(temp1);
                }
                }
            }
            else
            {
                q.add(null);
                boolean al_fill=true;
                for(String s:al)
                {
                    if (!(s.equals("-101")))
                         al_fill=false;
                }
                if(al_fill && al.size()>0)
                    break;
                boolean val= IsEvenPalindrome(al);
                if(val==false)
                    return false;
                al.clear();
                
            }
        }
        return true;
    }
    public boolean IsEvenPalindrome(ArrayList<String> al)
    {
        if(al.size()%2!=0)
            return false;
        for(int i=0;i<al.size();i++)
        {
            if(!(al.get(i).equals(al.get(al.size()-i-1))))
                return false;
        }
        return true;
    }
}
