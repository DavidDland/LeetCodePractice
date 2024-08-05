class Solution:
# Intuitively as long  as  we have remaining moves  we can continue to traverse. Each index serving as an move updater
    def canJump(self, nums: List[int]) -> bool:
        moves = 0
        for n in nums:
            if moves < 0:
                return False
            elif n > moves:
                moves = n
            moves -= 1
            
        return True
