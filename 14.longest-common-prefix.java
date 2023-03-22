/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";

        for (int l = 0; l < strs[0].length(); l++) {
            char currentPrefix = strs[0].charAt(l);

            for (int k = 1; k < strs.length; k++) {
                char newPrefix;
                if (l >= strs[k].length()){
                    return result;
                } else {
                    newPrefix = strs[k].charAt(l);
                }

                if (currentPrefix != newPrefix) {
                    return result;
                }
            }

            result += currentPrefix;
        }

        return result;

    }
}
// @lc code=end
