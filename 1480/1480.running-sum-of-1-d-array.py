#
# @lc app=leetcode id=1480 lang=python3
#
# [1480] Running Sum of 1d Array
#

# @lc code=start
class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        result = []

        for index, value in enumerate(nums):
            result.append(0)
            result[index] = result[index-1] + value 

        return result
# @lc code=end

