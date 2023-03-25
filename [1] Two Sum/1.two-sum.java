/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int k = 0; k < nums.length; k++) {
            int firstNumber = nums[k];
            int secondNumber = target - firstNumber;

            for (int l = k + 1; l < nums.length; l++) {
                int anotherNumber = nums[l];

                if (anotherNumber == secondNumber) {
                    result[0] = k;
                    result[1] = l;
                    break;
                }
            }
        }

        return result;
    }
}
// @lc code=end
