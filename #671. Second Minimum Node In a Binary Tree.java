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
    public int findSecondMinimumValue(TreeNode root) {
        ArrayList<Integer>al= new ArrayList<Integer>();
        preorder(root,al);
        Collections.sort(al);
        System.out.println(al);
        if(al.size()<=1)
            return -1;
        return al.get(1);
        
    }
     public void preorder(TreeNode root, ArrayList<Integer>al) {
         if(root!=null)
        {
             if(root.left==null)
             {
                 if(!al.contains(root.val))
                 al.add(root.val);
             }
             else
             {
                   if(!al.contains(Math.min(root.left.val, root.right.val)))
                 al.add(Math.min(root.left.val, root.right.val));
             }
             preorder(root.left,al);
             preorder(root.right,al);
        }
        
     }
}
