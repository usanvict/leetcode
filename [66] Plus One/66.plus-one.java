import java.util.ArrayList;
import java.util.Collections;

/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {

        ArrayList<Integer> list = new ArrayList<>();

        int increment = 1;
        int index = digits.length - 1;

        while (index >= 0) {
            int lastNumber = digits[index] + increment;
            index -= 1;
            if (lastNumber > 9) {
                list.add(0);
            } else {
                increment = 0;
                list.add(lastNumber);
            }
        }

        if (increment == 1) {
            list.add(1);
        }

        Collections.reverse(list);

        return list.stream().mapToInt(i -> i).toArray();

    }

    // public static void main(String[] args) {
    //     var sol = new Solution();
    //     int[] str = new int[]{1,2,3};
    //     sol.plusOne(str);
    // }

}
// @lc code=end
