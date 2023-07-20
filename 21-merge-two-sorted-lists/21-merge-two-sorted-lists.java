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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//check if list 1 or list 2 is null. If it is return non null list
        if (l1 == null || l2 == null) 
            return l1 == null ? l2 : l1;
//pointers to run through the list        
        ListNode p1 = l1, p2 = l2;
// Compare the values of the first nodes in both lists.
// If the value of the second list's node is smaller, swap the lists so that l1 starts with the smaller node.
        if (p2.val < p1.val) {
            ListNode tmp = p2;
            p2 = p2.next;
            tmp.next = p1;
            l1 = tmp;
            p1 = l1;
        }
// Merge the two sorted lists by inserting elements from the second list (l2) into the first list (l1) at the correct positions.
        while (p2 != null && p1.next != null) {
            ListNode tmp = p2;
            p2 = p2.next;
// Insert the current node from the second list into the first list.
            while (p1.next != null && p1.next.val < tmp.val) 
            p1 = p1.next;
            tmp.next = p1.next;
            p1.next = tmp;
            p1 = p1.next;
        }
//append remaining nodes from 2nd list to merged list
        if (p2 != null) p1.next = p2;
        return l1;
    }
}