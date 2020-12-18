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
    static ArrayList<Integer>al=new ArrayList<Integer>();
    public TreeNode increasingBST(TreeNode root) {
        al.clear();
       inorder(root);
       TreeNode res=new TreeNode(al.get(0));
       TreeNode res_root=res;
       TreeNode curr;
       for(int i=1;i<al.size();i++)
       {
         res.right=new TreeNode(al.get(i));
           res=res.right;
       }
       return  res_root;
    }
    public TreeNode inorder(TreeNode root) {
        if(root!=null)
        {
          inorder(root.left);
          al.add(root.val);
          inorder(root.right);
        }
        return root;
    }
}
