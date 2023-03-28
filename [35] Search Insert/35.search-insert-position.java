/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int result = nums.length;
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] == target || nums[k] > target) {
                return k;
            } 
        }
        return result;
    }
}
// @lc code=end
