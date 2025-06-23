class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        n = len(nums)
        #Account for case where k is greater than n. We only have to rotate by the remainder
        k = k % n
        rotated = [0] * n
        
        #For each element at index i, place it in the rotated array at index (i + k) % n.
        for i in range(n):
            rotated[(i + k) % n] = nums[i]
        
        for i in range(n):
            nums[i] = rotated[i]
        """
        Do not return anything, modify nums in-place instead.
        """
        
        