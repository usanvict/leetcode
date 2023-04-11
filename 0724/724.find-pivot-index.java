/*
 * @lc app=leetcode id=724 lang=java
 *
 * [724] Find Pivot Index
 */

// @lc code=start
class Solution {
    public int pivotIndex(int[] nums) {
        for (int k = 0; k < nums.length; k++){
            int firstSum = 0;
            int secondSum = 0;
            for (int l=0; l < k; l++){
                firstSum += nums[l];
            }
            for (int h=k+1; h < nums.length; h++){
                secondSum += nums[h];
            }

            if (firstSum == secondSum){
                return k;
            } 
            firstSum = 0;
            secondSum = 0;
        }

        return -1;
    }
}
// @lc code=end

