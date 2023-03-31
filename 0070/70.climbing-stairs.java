/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {

        if (n == 0) {
            return 0;
        }
        
        if (n == 1){
            return 1;
        }

        int first = 0;
        int second = 1;
        int nth = 0;

        for (int i = 1; i <= n; i++) {
            nth = first + second;
            first = second;
            second = nth;
        }
        return nth;

        
    }

}
// @lc code=end

