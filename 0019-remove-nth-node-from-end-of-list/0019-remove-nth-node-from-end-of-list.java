import java.util.*;
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode now = dummy;
        ListNode res = dummy;

        while(n-- >= 0)
            now = now.next;

        while(now != null){
            now = now.next;
            res = res.next;
        }
        res.next = res.next.next;

        return dummy.next;
    }
}