package Duplicates;
/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {

        int lastIndex = nums.length - 1;
        int diffs = 1;
        int numberCounter = 0;

        for (int k = 0; k < nums.length; k++) {
            if (k >= lastIndex) {
                continue;
            }

            if (nums[k] == nums[k + 1] && numberCounter == 0) {
                numberCounter += 1;
            } else if (nums[k] != nums[k + 1]) {
                nums[diffs] = nums[k + 1];
                numberCounter = 0;
                diffs += 1;
            }
        }
        return diffs;
    }

    // public static void main(String[] args) {
    // var sol = new Solution();
    // int[] str = new int[]{0,0,0,1,1,2,2,3,3,4};
    // sol.removeDuplicates(str);
    // }
}
// @lc code=end
