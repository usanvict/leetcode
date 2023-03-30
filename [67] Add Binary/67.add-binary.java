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

        String[] strSplit1 = a.split("");
        String[] strSplit2 = b.split("");

        ArrayList<String> strList1 = new ArrayList<>(Arrays.asList(strSplit1));
        ArrayList<String> strList2 = new ArrayList<>(Arrays.asList(strSplit2));

        int mainNumber = 0;
        ArrayList<String> mainList = new ArrayList<>();
        int notMainNumber = 0;
        ArrayList<String> notMainList = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        int increment = 0;

        if (strList1.size() > strList2.size()) {
            mainNumber = strList1.size() - 1;
            mainList = strList1;
            notMainNumber = strList2.size() - 1;
            notMainList = strList2;
        } else {
            mainNumber = strList2.size() - 1;
            mainList = strList2;
            notMainNumber = strList1.size() - 1;
            notMainList = strList1;
        }

        while (mainNumber >= 0) {
            Integer x = Integer.valueOf(mainList.get(mainNumber));

            if (notMainNumber >= 0) {
                Integer y = Integer.valueOf(notMainList.get(notMainNumber));
                if (x + y == 2) {
                    result.add(0 + increment);
                    increment = 1;
                } else if (x + y + increment == 2) {
                    result.add(0);
                    increment = 1;
                } else {
                    result.add(x + y + increment);
                    increment = 0;
                }
            } else {
                if (increment == 0) {
                    result.add(x);
                } else if (x + increment == 2) {
                    result.add(0);
                    increment = 1;
                } else {
                    result.add(increment);
                    increment = 0;
                }
            }

            notMainNumber -= 1;
            mainNumber -= 1;
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
    // var sol = new Solution();
    // String a = "101111";
    // String b = "10";
    // sol.addBinary(a, b);
    //
}
// @lc code=end
