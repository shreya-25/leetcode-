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
    public boolean findTarget(TreeNode root, int k) {
        makearraylist(root,k,al);
        for(int i:al)
        {
            if(al.contains(k-i) && i!=(k-i))
                return true;
        }
        return false;
    }
    public void makearraylist(TreeNode root, int k,ArrayList<Integer>al)
    {
        if(root!=null)
        {
                al.add(root.val);
                makearraylist(root.left,k,al);
                makearraylist(root.right,k,al);
        }
    }
}
