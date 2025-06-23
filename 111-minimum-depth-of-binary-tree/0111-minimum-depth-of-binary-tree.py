# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def minDepth(self, root: Optional[TreeNode]) -> int:
        # If the root is None, the tree is empty, so return depth 0
        if not root:
            return 0
        # If the node is a leaf node (no children), return depth 1
        if not root.left and not root.right:
            return 1
        # If there is no left child, recursively find the minimum depth of the right subtree and add 1
        if not root.left:
            return self.minDepth(root.right) + 1
        # If there is no right child, recursively find the minimum depth of the left subtree and add 1
        if not root.right:
            return self.minDepth(root.left) + 1
        # If both children exist, find the minimum depth of both subtrees, take the smaller one, and add 1
        return min(self.minDepth(root.left), self.minDepth(root.right)) + 1
        