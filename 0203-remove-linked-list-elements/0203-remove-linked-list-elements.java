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
        
        if(head==null)
            return null;
        else if(head.val==val)
            return(removeElements(head.next,val));
        else
        {
            ListNode temp=head.next;
            ListNode prev=head;
            while(temp!=null)
            {
                ListNode forw=temp.next;
                if(temp.val==val)
                {
                    prev.next=forw;
                    temp=forw;
                }
                else
                {
                    prev=temp;
                    temp=forw;
                }
            }
                
            return head;
        }
    }
}