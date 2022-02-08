/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    Queue<Node> q= new LinkedList<>();
    int res=0;
    public int maxDepth(Node root)
    {
        if(root==null)
            return 0;
        q.add(root);
        q.add(null);
        while(q.size()>0)
        {
           // System.out.println(q);
            Node temp=q.remove();
            if(q.size()==0 && temp==null)
            {
               break;
            }
            else if(temp==null)
            {
                res++;
                q.add(null);
            }
            else
            {
               for(int i=0;i<temp.children.size();i++)
                    q.add(temp.children.get(i));
            }
        }
        return res+1;
    }
}
