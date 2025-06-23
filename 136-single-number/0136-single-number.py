#Brute Force n^2 || Sort then check nlogn + n || Dictionary , but is O(n) space which doesnt meet constraint || So we use xor bitwise
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        xor = 0
        for num in nums:
            xor ^= num
        
        return xor