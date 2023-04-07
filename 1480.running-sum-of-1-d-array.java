/*
 * @lc app=leetcode id=1480 lang=java
 *
 * [1480] Running Sum of 1d Array
 */

// @lc code=start
class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];

        for (int k = 0; k < nums.length; k++){
            for (int l = 0; l <= k; l++){
                result[k] += nums[l];
            }
        }

        return result;
    }
}
// @lc code=end

