import java.util.HashMap;

/*
 * @lc app=leetcode id=424 lang=java
 *
 * [424] Longest Repeating Character Replacement
 */

// @lc code=start
class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];

        int maxCount = 0;
        int begin = 0;
        int maxLength = 0;

        for (int end = 0; end < s.length(); end++) {
            arr[s.charAt(end) - 'A']++;

            maxCount = Math.max(maxCount, arr[s.charAt(end) - 'A']);

            if (end - begin + 1 - maxCount > k) {
                arr[s.charAt(begin) - 'A']--;
                begin++;
            }

            maxLength = Math.max(maxLength, end - begin + 1);
        }

        return maxLength;
    }
}
// @lc code=end
