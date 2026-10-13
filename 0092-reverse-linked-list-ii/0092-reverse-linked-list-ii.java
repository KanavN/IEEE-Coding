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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right)
            return head;

        ListNode temp = head;
        ListNode before = null;

        for (int i = 1; i < left; i++) {
            before = temp;
            temp = temp.next;
        }

        ListNode r = temp;
        ListNode prev = null;

        for (int i = left; i <= right; i++) {
            ListNode forw = temp.next;
            temp.next = prev;
            prev = temp;
            temp = forw;
        }

        r.next = temp;

        if (before == null)
            return prev;

        before.next = prev;
        return head;
    }
}
