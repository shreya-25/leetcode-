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
    String str="";
    public String tree2str(TreeNode t) {
        
        if(t!=null)
        {
            str+=t.val;
            if(t.left!=null)
            {
                str+="(";
                tree2str(t.left);
                str+=")";
            }
            if(t.left==null && t.right!=null)
            {
               str+="()";
            }
            if(t.right!=null)
            {
                str+="(";
                tree2str(t.right);
                str+=")";
            }
        }
       
        return str;
    }
}
