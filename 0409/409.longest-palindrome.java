import java.util.HashMap;

/*
 * @lc app=leetcode id=409 lang=java
 *
 * [409] Longest Palindrome
 */

// @lc code=start
class Solution {
    public int longestPalindrome(String s) {

        String[] s1 = s.split("");

        HashMap<String, Integer> results = new HashMap<>();

        int number = 0;
        int first = 0;

        for (int i=0; i < s1.length; i++){
            if (!results.containsKey(s1[i])){
                results.put(s1[i], 1);
            } else {
                int val = results.get(s1[i]);
                results.put(s1[i], val+1);
            }
        }

        for (Integer value : results.values()){
            if (value % 2 == 0){
                number += value;
            } else {
                if (value % 2 == 1 && first == 0){
                    number += value;
                    first = 1;
                } else {
                    number += value - 1;
                }
            } 
        }

        return number;
        
    }
}
// @lc code=end

