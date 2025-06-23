class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        max_water = 0
        ptr1 = 0
        ptr2 = len(height) - 1
        while(ptr1 != ptr2) :
            n = min(height[ptr1],height[ptr2])
            water = n * (ptr2 - ptr1)
            if water > max_water :
                max_water = water
            if n == height[ptr1] :
                ptr1 += 1
            else :
                ptr2 -= 1
        return max_water      