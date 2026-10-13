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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        ArrayList<Integer> stack = new ArrayList<>();

        while (fast != null && fast.next != null) {
            stack.add(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null)
            slow = slow.next;

        while (slow != null) {
            if (stack.get(stack.size() - 1) != slow.val)
                return false;
            stack.remove(stack.size() - 1);
            slow = slow.next;
        }

        return true;
    }
}