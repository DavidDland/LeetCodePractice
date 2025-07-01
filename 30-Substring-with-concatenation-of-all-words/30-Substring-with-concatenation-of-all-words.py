class Solution(object):
    def findSubstring(self, s, words):
        """
        :type s: str
        :type words: List[str]
        :rtype: List[int]
        """
        if not s or not words:
            return []

        word_len = len(words[0])
        num_words = len(words)
        total_len = word_len * num_words
        word_count = {}

        # Count frequency of each word
        for word in words:
            if word in word_count:
                word_count[word] += 1
            else:
                word_count[word] = 1

        result = []

        # Check every possible starting index
        for i in range(len(s) - total_len + 1):
            seen = {}
            j = 0

            while j < num_words:
                word_start = i + j * word_len
                word = s[word_start:word_start + word_len]

                if word not in word_count:
                    break

                if word in seen:
                    seen[word] += 1
                else:
                    seen[word] = 1

                if seen[word] > word_count[word]:
                    break

                j += 1

            if j == num_words:
                result.append(i)

        return result
