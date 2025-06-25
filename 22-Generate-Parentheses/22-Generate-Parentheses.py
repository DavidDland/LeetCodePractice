class Solution(object):
    def generateParenthesis(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        if not n:
            return []

        result = []
        self.dfs(n, n, "", result)
        return result

    def dfs(self, left, right, path, result):
        # Invalid state: more ')' used than '('
        if right < left:
            return
        
        # Valid complete sequence
        if left == 0 and right == 0:
            result.append(path)
            return

        # Add '(' if any left
        if left > 0:
            self.dfs(left - 1, right, path + "(", result)

        # Add ')' if any right
        if right > 0:
            self.dfs(left, right - 1, path + ")", result)
