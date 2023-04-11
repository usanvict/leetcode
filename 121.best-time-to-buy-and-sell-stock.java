/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = prices[0];

        for (int k = 0; k < prices.length; k++) {
            if (min > prices[k]) {
                min = prices[k];
            } else if (prices[k] - min > max) {
                max = prices[k] - min;
            }
        }

        return max;
    }
}
// @lc code=end
