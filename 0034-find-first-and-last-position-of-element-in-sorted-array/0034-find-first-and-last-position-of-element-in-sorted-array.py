class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        def findBound(isFirst):
            left, right = 0, len(nums) - 1
            bound = -1
            while left <= right:
                mid = (left + right) // 2
                if nums[mid] == target:
                    bound = mid
                    if isFirst:
                        right = mid - 1  # search toward the left
                    else:
                        left = mid + 1   # search toward the right
                elif nums[mid] < target:
                    left = mid + 1
                else:
                    right = mid - 1
            return bound

        start = findBound(True)
        end = findBound(False)
        return [start, end]
