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
    int max=0;
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        ArrayList<Integer>al=new ArrayList<Integer>();
        preorder(root,map);
        for(int i:map.keySet())
        {
            if(map.get(i)==max)
                al.add(i);
        }
         int[] arr = new int[al.size()];
        int c=0;
         for(int i:al)
             arr[c++]=i;
        return arr;
    }
    public void preorder(TreeNode root, HashMap<Integer,Integer>map)
    {
        if(root!=null)
        {
            map.put(root.val, map.getOrDefault(root.val,0)+1);
            if(map.get(root.val)>max)
            {
                max=map.get(root.val);
            }
            preorder(root.left,map);
            preorder(root.right,map);
        }
    }
}
