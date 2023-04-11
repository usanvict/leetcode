import java.util.HashMap;

import javax.imageio.plugins.tiff.TIFFField;

/*
 * @lc app=leetcode id=205 lang=java
 *
 * [205] Isomorphic Strings
 */

// @lc code=start
class Solution {
    public boolean isIsomorphic(String s, String t) {

        String[] s1 = s.split("");
        String[] t1 = t.split("");

        HashMap<String, String> results = new HashMap<>();

        for (int k = 0; k < s1.length; k++) {
            if (!results.containsKey(s1[k])) {
                if (!results.containsValue(t1[k])) {
                    results.put(s1[k], t1[k]);
                } else {
                    return false;
                }
            } else {
                if (!results.get(s1[k]).equals(t1[k])) {
                    return false;
                }
            }
        }

        return true;

    }

    // public static void main(String[] args) {
    //     var sol = new Solution();
    //     String s = "egg";
    //     String t = "add";
    //     sol.isIsomorphic(s, t);
    // }
}
// @lc code=end
