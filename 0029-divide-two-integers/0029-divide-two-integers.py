class Solution(object):
    def divide(self, dividend, divisor):
        """
        :type dividend: int
        :type divisor: int
        :rtype: int
        """

        INT_MAX = 2147483647
        INT_MIN = -2147483648

        # Special case: overflow
        if dividend == INT_MIN and divisor == -1:
            return INT_MAX

        # Track if result is negative
        negative = 0
        if dividend > 0:
            dividend = -dividend
            negative += 1
        if divisor > 0:
            divisor = -divisor
            negative += 1

        quotient = 0

        while dividend <= divisor:
            temp = divisor
            multiple = 1

            # Double temp and multiple until it's just below dividend
            while dividend <= (temp + temp) and (temp + temp) >= INT_MIN:
                temp += temp
                multiple += multiple

            dividend -= temp
            quotient += multiple

        if negative == 1:
            return -quotient
        else:
            return quotient
