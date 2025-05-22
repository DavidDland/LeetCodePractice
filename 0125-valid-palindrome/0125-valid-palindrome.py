class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        str_list = [char.lower() for char in s if char.isalnum()]
        new_str = ''.join(str_list)
        
        return new_str == new_str[::-1]