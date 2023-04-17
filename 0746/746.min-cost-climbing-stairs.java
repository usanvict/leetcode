/*
 * @lc app=leetcode id=746 lang=java
 *
 * [746] Min Cost Climbing Stairs
 */

// @lc code=start
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int minCost0 = cost[0];
        int minCost1 = cost[1];

        for (int i = 2; i < cost.length; i++) {
            int newVal = Math.min(minCost0, minCost1) + cost[i];
            minCost0 = minCost1;
            minCost1 = newVal;
        }

        return Math.min(minCost0, minCost1);
    }
}
// @lc code=end
