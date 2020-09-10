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
    public int getDecimalValue(ListNode head) {
        String s="";int ans=0,a=0;
        ListNode curr=head;
        while(curr!=null)
        {
            s=curr.val+s;
            curr=curr.next;
        }
        for(int i=0;i<s.length();i++)
        {
            //int a = Integer.parseInt(String.valueOf(s.charAt(i))); 
            a=s.charAt(i)-'0';
            ans+=(int)(Math.pow(2,i)*a);
        }
        return ans;
    }
}
