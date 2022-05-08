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
    boolean res=false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum=0;
        helper(root,sum, targetSum);
        return res;
    }
    public void helper(TreeNode root, int sum,int target)
    {
        if(root!=null)
        {
            if(root.left==null && root.right==null)
            {
                if((sum+root.val)==target)
                {
                    res=true;
                }
            }
            helper(root.left,sum+root.val,target);
            helper(root.right,sum+root.val,target);
            
        }
        
    }
}
