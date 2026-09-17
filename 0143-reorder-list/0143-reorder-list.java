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
        // Using a slow and fast pointer so that the slow pointer is at the middle
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // Creating the second list starting from slow.next and ending slow.next from now on
        ListNode second = slow.next;
        slow.next = null;

        // Reversing the second linked list using the curr, prev, and temp concepts
        ListNode curr = second;
        ListNode prev = null;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        // prev now is the reversed second list, therfore second is hereby reversed
        second = prev;
        ListNode first = head;
        // Now the two lists should be merged together so that we can start by taking one fromm slow and 
        while(second != null){
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;

            first.next = second;
            second.next = tmp1; //tmp one is the first.next before bieng edited

            // This is for moving both nodes to the next point, and the loop would end when second becomes null

            first = tmp1;
            second = tmp2;

        }
    }
}