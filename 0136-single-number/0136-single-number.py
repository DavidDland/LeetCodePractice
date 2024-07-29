#Brute Force n^2 || Sort then check nlogn + n || Dictionary , but is O(n) space which doesnt meet constraint
class Solution:
    def singleNumber(self, nums):
        count_dict = {}
        
        # Count the occurrences of each number
        for num in nums:
            if num in count_dict:
                count_dict[num] += 1
            else:
                count_dict[num] = 1
        
        # Find the number that appears only once
        for num, count in count_dict.items():
            if count == 1:
                return num