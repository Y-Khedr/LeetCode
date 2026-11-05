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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode second = head;

        while(second != null && second.next != null){
            slow = slow.next;
            second = second.next.next;
        }
        second = slow.next;
        slow.next = null;

        ListNode curr = second, prev = null, temp;
        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        second = prev;

        ListNode first = head;
        ListNode tmp1 = null;
        ListNode tmp2 = null;

        while(second != null){
            tmp1 = first.next;
            tmp2 = second.next;

            first.next = second;
            second.next = tmp1;

            first = tmp1;
            second = tmp2;
        }

    }
}