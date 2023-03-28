import java.util.HashMap;
import java.util.Hashtable;

/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.equals("")){
            return 0;
        }
        String[] str = s.split("");
        int diffs = 0;
        HashMap<Integer, HashMap<String, Integer>> result = new HashMap<>();

        for (int k = 0; k < str.length; k++) {
            int slideDoor = k;
            while (slideDoor != str.length) {
                if (result.get(k) == null) {
                    HashMap<String, Integer> internalResult = new HashMap<>();
                    internalResult.put(str[slideDoor], 1);
                    result.put(k, internalResult);
                } else {
                    if (!result.get(k).containsKey(str[slideDoor])) {
                        result.get(k).put(str[slideDoor], 1);
                    } else {
                        if (diffs < result.get(k).size()) {
                            diffs = result.get(k).size();
                        }
                        break;
                    }

                }
                slideDoor += 1;
            }
        }

        for (int key : result.keySet()) {
            if (diffs < result.get(key).size()){
                diffs = result.get(key).size();
            }
        }

        return diffs;
    }

    // public static void main(String[] args) {
    //     var sol = new Solution();
    //     String s = "pwwkew";
    //     sol.lengthOfLongestSubstring(s);
    // }
}
// @lc code=end
