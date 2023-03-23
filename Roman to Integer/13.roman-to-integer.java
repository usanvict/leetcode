import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        int result = 0;

        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("I", 1);
        numbers.put("V", 5);
        numbers.put("X", 10);
        numbers.put("L", 50);
        numbers.put("C", 100);
        numbers.put("D", 500);
        numbers.put("M", 1000);

        String[] arr = s.split("");

        String currentDigit = "";
        String nextDigit = "";

        for (int k = 0; k < arr.length; k++){
            currentDigit = arr[k];
            if (k + 1 < arr.length){
                nextDigit = arr[k+1];
            }
            
            if (currentDigit.equals("I") && (nextDigit.equals("V") || nextDigit.equals("X"))){
                result -= 1;
                continue;
            } else if (currentDigit.equals("X") && (nextDigit.equals("L") || nextDigit.equals("C"))){
                result -= 10;
                continue;
            } else if (currentDigit.equals("C") && (nextDigit.equals("D") || nextDigit.equals("M"))) {
                result -= 100;
                continue;
            }

            result += numbers.get(currentDigit);
        }

        return result;
    }
}
// @lc code=end

