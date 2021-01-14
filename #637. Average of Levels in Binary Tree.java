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
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double>al=new ArrayList<Double>();
        long s=0;int c=0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            TreeNode curr=q.poll();
            if(curr!=null)
            {
                if(curr.left!=null)
                   q.add(curr.left);
                if(curr.right!=null)
                   q.add(curr.right);
                s=s+ curr.val;
                c++;
            }
            else
            {
                double ans=(double)s/c;
                al.add(ans);
                s=0;
                c=0;
                if(q.isEmpty())
                    break;
                q.add(null);
            }
        }
        return al;
    }
}
