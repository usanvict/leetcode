/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {

        int currInd = -1;
        int diffs = 0;

        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != val) {
                diffs += 1;
                if (currInd != -1) {
                    nums[currInd] = nums[k];
                    currInd += 1;
                }
            } else {
                if (currInd == -1) {
                    currInd = k;
                }
            }
        }

        return diffs;
    }

    // public static void main(String[] args) {
    //     var sol = new Solution();
    //     int[] nums = new int[] { 0, 1, 2, 2, 3, 0, 4, 2 };
    //     int val = 2;
    //     sol.removeElement(nums, val);
    // }
}
// @lc code=end
