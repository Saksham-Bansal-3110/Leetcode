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
    public ListNode removeElements(ListNode head, int val) {
        ListNode ans = new ListNode(0);
        ListNode dummy = ans;
        ListNode current = head;
        while(current != null){
            if (current.val != val){
                dummy.next = current;
                dummy = dummy.next;
            }
            current = current.next;
        }
        dummy.next = null;
        return ans.next;
    }
}
