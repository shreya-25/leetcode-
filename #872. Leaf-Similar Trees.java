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
    static  ArrayList<Integer>al2=new ArrayList<Integer>();
    static  ArrayList<Integer>al3=new ArrayList<Integer>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer>al=new ArrayList<Integer>();
        ArrayList<Integer>al1=new ArrayList<Integer>();
        al=leafsequence(root1,1,0,1);
        al1=leafsequence(root2,0,1,0);
        if(al.size()!=al1.size())
            return false;
        for(int i=0;i<al.size();i++)
        {
            if(al.get(i)!=al1.get(i))
                return false;
        }
        return true;
    }
    public static ArrayList<Integer> leafsequence(TreeNode root,int c,int d,int e)
    {
        if(e==0)
            al3.clear();
        e++;
        if(d==0)
        {
            al2.clear();
            d++;
        }
        if(c==1)
        {
        if(root!=null)
        {
            if(root.left==null && root.right==null)
                al2.add(root.val);
            leafsequence(root.left,c,d,e);
            leafsequence(root.right,c,d,e);
        }
        return al2;
        }
        else
        {
           if(root!=null)
        {
            if(root.left==null && root.right==null)
                al3.add(root.val);
            leafsequence(root.left,c,d,e);
            leafsequence(root.right,c,d,e);
        }
        return al3; 
        }
        
    }
}
