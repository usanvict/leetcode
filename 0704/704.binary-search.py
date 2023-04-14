#
# @lc app=leetcode id=704 lang=python
#
# [704] Binary Search
#

# @lc code=start
class Solution(object):
    def search(self, nums, target):

        result = -1

        for idx, x in enumerate(nums):
            if x == target:
                result = idx
                break
            if x > target:
                return -1

        return result
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """

# @lc code=end
