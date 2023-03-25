#
# @lc app=leetcode id=1 lang=python3
#
# [1] Two Sum
#

from typing import List

# @lc code=start


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        result = []

        for idx, x in enumerate(nums):
            firstNumber = x
            secondNumber = target - firstNumber

            for idy, y in enumerate(nums[idx+1:]):
                anotherNumber = y

                if (anotherNumber == secondNumber):
                    result.insert(0, idx)
                    result.insert(1, idy+idx+1)
                    return result

# @lc code=end

if __name__ == '__main__':
    solution = Solution()
    print(solution.twoSum([2,7,11,15], 9))