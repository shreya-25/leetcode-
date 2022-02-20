/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        int sum=0;
        ListNode temp=head;
        ListNode curr=head.next;
        while(curr!=null)
        {
            if(curr.val==0)
            {
                ListNode new_node= new ListNode(sum) ;
                new_node.next=curr.next;
                sum=0;
                if(temp.val!=0){
                   temp.next=new_node;
                   // new_node.next= curr.next;
                   temp=new_node;}
                else
                {
                    // temp.val=new_node.val;
                    // new_node.next= curr.next;
                    // temp.next=new_node.next;
                    head.val=new_node.val;
                    head.next=new_node.next;
                }
               
            }
            else
            {
                 sum+=curr.val ;
                 //System.out.println(sum);
            }
            curr=curr.next;
        }
        return head;
    }
}
