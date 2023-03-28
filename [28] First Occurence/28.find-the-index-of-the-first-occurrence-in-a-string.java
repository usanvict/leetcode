/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Find the Index of the First Occurrence in a String
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        String[] stack = haystack.split("");
        String[] word = needle.split("");

        int stackInd = -1;
        int wordInd = 0;

        if (stack.length < word.length) {
            return -1;
        }

        for (int k = 0; k < stack.length; k++) {
            stackInd = k;
            while (stack[stackInd].equals(word[wordInd])) {
                wordInd += 1;
                stackInd += 1;
                if (wordInd == word.length) {
                    stackInd -= word.length;
                    return stackInd;
                }
                if (stackInd == stack.length){
                    return -1;
                }
            }
            if (!stack[stackInd].equals(word[wordInd])) {
                stackInd = -1;
                wordInd = 0;
            }
        }

        return stackInd;
    }

    // public static void main(String[] args) {
    // var sol = new Solution();
    // String haystack = "babba";
    // String needle = "bbb";
    // sol.strStr(haystack, needle);
    // }
}
// @lc code=end
