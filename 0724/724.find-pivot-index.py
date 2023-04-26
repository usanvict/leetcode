#
# @lc app=leetcode id=724 lang=python3
#
# [724] Find Pivot Index
#

# @lc code=start
class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        firstSum = 0
        secondSum = sum(nums)
        print(secondSum)

        for index, value in enumerate(nums):
            if index-1 >= 0:
                firstSum += nums[index-1]
            secondSum -= nums[index]
            print("first = {}".format(firstSum))
            print("second = {}".format(secondSum))

            if firstSum == secondSum:
                return index

        return -1

# @lc code=end
