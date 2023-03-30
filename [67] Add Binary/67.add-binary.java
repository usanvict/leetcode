import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {

        ArrayList<String> strList1 = new ArrayList<>(Arrays.asList(a.split("")));
        ArrayList<String> strList2 = new ArrayList<>(Arrays.asList(b.split("")));

        ArrayList<Integer> result = new ArrayList<>();
        int increment = 0;

        int index1 = strList1.size() - 1;
        int index2 = strList2.size() - 1;

        while (index1 >= 0 || index2 >= 0) {
            Integer x = index1 >= 0 ? Integer.valueOf(strList1.get(index1)) : 0;
            Integer y = index2 >= 0 ? Integer.valueOf(strList2.get(index2)) : 0;

            int value = x + y + increment;

            if (value > 1) {
                result.add(value % 2);
                increment = 1;
            } else {
                result.add(value);
                increment = 0;
            }

            index1 -= 1;
            index2 -= 1;
        }

        if (increment != 0) {
            result.add(increment);
        }

        Collections.reverse(result);
        String joined = "";
        for (Integer s : result) {
            joined += s.toString();
        }

        return joined;

    }

    // public static void main(String[] args) {
    //     var sol = new Solution();
    //     String a = "11";
    //     String b = "1";
    //     sol.addBinary(a, b);
    // }

}
// @lc code=end
