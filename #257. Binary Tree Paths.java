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
    ArrayList<String>al=new ArrayList<String>();
    public List<String> binaryTreePaths(TreeNode root) {
        preorder(root,al,"");
        return al;
    }
    public void preorder(TreeNode root,ArrayList<String>al,String s)
    {
        if(root!=null)
        {
            s+=root.val;
            if(root.left==null && root.right==null)
                al.add(s);
            if(root.left!=null)
            {
                s+="->";
                preorder(root.left,al,s);
            }
            if(root.right!=null)
            {
                if(root.left==null)
                      s+="->";
                preorder(root.right,al,s);
            }
        }
    }
}
