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
// Simply while the next node of the curr isnt null then we can check it
// if it's the same then move the next to the following node and repeat. If it isnt go to the next node repeat
public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        while (node != null && node.next != null) {
            if (node.val == node.next.val) node.next = node.next.next;
            else node = node.next;
        }
        return head;
    }
}