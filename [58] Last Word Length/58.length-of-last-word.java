/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        int result = str[str.length-1].length();
        return result;
    }
}
// @lc code=end

