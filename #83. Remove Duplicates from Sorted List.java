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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null ||head.next==null)
            return head;
        ListNode curr=head;
        ListNode forward=curr.next;
        while(forward!=null)
        {
            if(curr.val==forward.val)
            {
                curr.next=forward.next;
                forward=forward.next;
            }
            else
            {
                curr=curr.next;
                forward=forward.next;
            }
        }
        return head;
    }
}
