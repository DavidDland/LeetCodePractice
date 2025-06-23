# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def rotateRight(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        # If the list is empty, return None
        if not head:
            return None
        # If the list has only one node, return the head
        if not head.next:
            return head
        
        # Initialize the length of the list to 1
        n = 1
        cur = head
        
        # Traverse the list to find its length and make it circular
        while cur.next:
            cur = cur.next
            n += 1
        cur.next = head
        
        # Find the new head after rotating
        cur = head
        for _ in range(n - k % n - 1):
            cur = cur.next
        
        # Set the new head and break the circular link
        new_head = cur.next
        cur.next = None
        
        return new_head
            
            