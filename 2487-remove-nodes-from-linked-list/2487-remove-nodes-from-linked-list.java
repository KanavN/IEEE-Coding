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
    public ListNode removeNodes(ListNode head) {
        ArrayList<Integer> stack = new ArrayList<>();
        ListNode temp = head;

        while (temp != null) {
            while (!stack.isEmpty() && stack.get(stack.size() - 1) < temp.val)
                stack.remove(stack.size() - 1);
            stack.add(temp.val);
            temp = temp.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        for (int val : stack) {
            tail.next = new ListNode(val);
            tail = tail.next;
        }

        return dummy.next;
    }
}
