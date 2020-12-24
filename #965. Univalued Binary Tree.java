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
    public boolean isUnivalTree(TreeNode root) {
        return preOrder(root,root.val);
    }
    private boolean preOrder(TreeNode root,int ch)
    {
        if(root==null)
            return true;
       if(root.val!=ch)
           return false;
        
         return preOrder(root.left,ch) && preOrder(root.right,ch);   
    }
}
