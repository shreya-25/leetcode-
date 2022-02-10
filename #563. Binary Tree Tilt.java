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
    ArrayList<Integer>al=new ArrayList<Integer>();
    public int findTilt(TreeNode root) {
         inorder(root,al);
         int s=0;
         for(int i:al)
             s+=i;
        return s;
    }
    public void inorder(TreeNode root, ArrayList<Integer>al)
    {
        if(root!=null)
        {
            inorder(root.left,al);
            inorder(root.right,al);
            if(root.left==null && root.right!=null)
            {
                root.val+=root.right.val;
                al.add(Math.abs(root.right.val));
            }
            else if(root.right==null && root.left!=null)
            {
               root.val+=root.left.val; 
               al.add(Math.abs(root.left.val));
            }
             else if(root.right!=null && root.left!=null)   
             {
                  root.val+=root.left.val+root.right.val; 
               al.add(Math.abs(root.left.val-root.right.val));
             }
      
        }
    }
}
