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
    public ListNode middleNode(ListNode head) {
        ListNode curr=head;
        int c=0;
        while(curr!=null)
        {
           c++;
           curr=curr.next;
        }
       curr=head;
       int mid=(int)c/2;
       while(mid!=0)
       {
          mid--;
          curr=curr.next;
       }
        return curr;
    }
}
