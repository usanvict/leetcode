#
# @lc app=leetcode id=70 lang=python3
#
# [70] Climbing Stairs
#

# @lc code=start
class Solution:
    def climbStairs(self, n: int) -> int:
        if n == 0:
            return 0
        
        if n == 1:
            return 1
        
        first = 0
        second = 1
        nth = 0

        for x in range(n):
            nth = first + second
            first = second
            second = nth
        
        return nth
# @lc code=end

