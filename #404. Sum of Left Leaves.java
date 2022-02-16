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
    int s=0;
    public int sumOfLeftLeaves(TreeNode root) {
      preorder(root);
      return s;
    }
    public void preorder(TreeNode root)
    {
        if(root!=null)
        {
            if(root.left!=null && (root.left.left==null && root.left.right==null))
                s+=root.left.val;
            preorder(root.left);
            preorder(root.right);
        }
    }
}
