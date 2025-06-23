# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        # Step 0: Use a dummy node to simplify edge cases
        dummy = ListNode(0)
        dummy.next = head

        first = dummy
        second = dummy

        # Step 1: Move 'first' n+1 steps forward so there's a gap of n between first and second
        for _ in range(n + 1):
            first = first.next

        # Step 2: Move both pointers until 'first' reaches the end
        while first:
            first = first.next
            second = second.next

        # Step 3: Skip the nth node from end
        second.next = second.next.next

        # Step 4: Return new head
        return dummy.next