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
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root!=null)
        {
            if(root.val>=L && root.val<=R)
                s=s+root.val;
            rangeSumBST(root.left,L,R);
            rangeSumBST(root.right,L,R);
        }
        return s;
    }
}
