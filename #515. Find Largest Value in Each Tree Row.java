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
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<TreeNode>();
        List<Integer> res= new ArrayList<Integer>();
        int max=Integer.MIN_VALUE;
        q.add(root);
        q.add(null);
        if(root==null)
            return res;
        while(q.size()>1 || q.peek()!=null)
        {
            TreeNode node= q.remove();
            if(node==null)
            {
                q.add(null);
                res.add(max);
                //System.out.println(max);
                max=Integer.MIN_VALUE;
                
            }
            else
            {
                if(node.val>max)
                    max=node.val;
               // System.out.println(max);
                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
                //System.out.println(q);
            }
        }
        res.add(max);
        return res;
    }
}
