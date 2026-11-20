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
        ListNode fast = head, slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        //ListNode second = slow;        
        //Reverse
        ListNode curr = slow, prev = null, tmp = null;
        while(curr != null){
            tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        slow = prev;
        //curr = head;
        while(slow != null){
            if((int) head.val != (int) slow.val)
                return false;
            head = head.next;
            slow = slow.next;
        }
        return true;
    }
}