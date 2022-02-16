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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode>q=new LinkedList<>();
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        ArrayList<Integer>al=new ArrayList<Integer>();
        q.add(root);
        q.add(null);
      
        while(q.size()>0)
        {
            TreeNode temp= q.remove();
            if(temp!=null)
            {
                if(temp.left!=null)
                {
                     q.add(temp.left);
                     map.put(temp.left.val,temp.val);
                }
                if(temp.right!=null)
                {
                     q.add(temp.right);
                    map.put(temp.right.val,temp.val);
                }
                al.add(temp.val);
            }
            else
            {
                if(al.contains(x) && al.contains(y))
                {
                    if(map.get(x)!=map.get(y))
                        return true;
                    return false;
                }
                else if(!al.contains(x) && (!al.contains(y)))
                {
       
                    al.clear();
                    q.add(null);
                }
                else
                   return false;
            }
        }
        return false;
    }
}
