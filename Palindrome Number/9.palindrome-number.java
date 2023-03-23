/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);

        String[] arr = s.split("");

        for (int k = 0; k < arr.length/2; k++) {
            if (!arr[k].equals(arr[arr.length - k - 1])) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end