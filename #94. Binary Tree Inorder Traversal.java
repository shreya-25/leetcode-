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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer>al=new ArrayList<Integer>();
        return inorder(root,al);
    }
     public List<Integer> inorder(TreeNode root, ArrayList<Integer> al)     
     {
          if(root!=null)  
          {
              inorder(root.left,al);
              al.add(root.val);
              inorder(root.right,al);
              
          }
         return al;
     }
}
