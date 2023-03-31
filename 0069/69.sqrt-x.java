/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {

        for (int k = 1; k <= x / 2 + 1; k++) {
            long squared = (long) k * k;
            if (squared == x) {
                return k;
            } else if (squared > x) {
                return k - 1;
            }
        }

        return 0;

    }

}
// @lc code=end
