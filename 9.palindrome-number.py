#
# @lc app=leetcode id=9 lang=python
#
# [9] Palindrome Number
#

# @lc code=start
class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        y = list(str(x))

        for idz, z in enumerate(y[:int(len(y)/2)]):
            if z != y[len(y)-idz-1]:
                return False

        return True
        
# @lc code=end

if __name__ == '__main__':
    solution = Solution()
    print(solution.isPalindrome(-121))