# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def swapPairs(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head is None:
            return None

        original_head = head
        new_head = original_head.next

        first = head
        second = first.next if head is not None else None
        temp = second.next if second is not None else None
        bridge = None

        if second is None:
            return original_head

        while second is not None and first is not None:
            temp1 = temp
            second.next = first
            first.next = temp1

            if bridge:
                bridge.next = second

            bridge = first
            first = first.next
            second = first.next if first is not None else None
            temp = second.next if second is not None else None

        return new_head