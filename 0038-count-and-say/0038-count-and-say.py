class Solution:
    def countAndSay(self, n: int) -> str:
        def run_length_encode(s):
            encoded = []
            count = 1
            for i in range(1, len(s)):
                if s[i] == s[i - 1]:
                    count += 1
                else:
                    encoded.append(str(count) + s[i - 1])
                    count = 1
            encoded.append(str(count) + s[-1])
            return ''.join(encoded)

        result = "1"
        for _ in range(1, n):
            result = run_length_encode(result)
        return result        