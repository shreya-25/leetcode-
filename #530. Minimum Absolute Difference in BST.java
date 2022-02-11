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
    public int getMinimumDifference(TreeNode root) 
    {
         int min=Integer.MAX_VALUE;
         inorder(root,al);
        for(int i=0;i<al.size()-1;i++)
        {
            min=Math.min(min,al.get(i+1)-al.get(i));
        }
         return min;
    }
    public void inorder(TreeNode root,ArrayList<Integer>al)
    {
        if(root!=null)
        {
            inorder(root.left,al);
            al.add(root.val);
            inorder(root.right,al);
        }
    }
}
