/*
 * @lc app=leetcode id=704 lang=java
 *
 * [704] Binary Search
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {

        int result = -1;

        for (int k = 0; k < nums.length; k++){
            if (nums[k]==target){
                result = k;
                break;
            }
            if (nums[k] > target){
                return -1;
            }
        }
        
        return result;
    }
}
// @lc code=end

