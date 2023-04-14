/*
 * @lc app=leetcode id=278 lang=java
 *
 * [278] First Bad Version
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {

        int result = 1;
        int end = n;

        while (result < end) {
            int m = result + (end - result) / 2;
            if (isBadVersion(m)) {
                end = m;
            } else {
                result = m + 1;
            }
        }

        return result;

    }
}
// @lc code=end
