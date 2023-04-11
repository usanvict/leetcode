/*
 * @lc app=leetcode id=392 lang=java
 *
 * [392] Is Subsequence
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        String[] s1 = s.split("");
        String[] t1 = t.split("");

        if (s1.length > t1.length) {
            return false;
        }

        if (s.length() == 0) {
            return true;
        }

        int index = 0;

        for (int k = 0; k < s1.length; k++) {
            for (int l = index; l < t1.length; l++) {
                if (t1[l].equals(s1[k])) {
                    index = l + 1;
                    if (l == t1.length - 1 && !t1[l].equals(s1[k]) || index == t1.length && k != s1.length - 1) {
                        return false;
                    } else {
                        break;
                    }
                } else {
                    if (l == t1.length - 1 && !t1[l].equals(s1[k]) || index == t1.length && k != s1.length) {
                        return false;
                    }
                }
            }
        }

        return true;

    }

    // public static void main(String[] args) {
    // var sol = new Solution();
    // String s = "abc";
    // String t = "ahbgdc";
    // sol.isSubsequence(s, t);
    // }
}
// @lc code=end
