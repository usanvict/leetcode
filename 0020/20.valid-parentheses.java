import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        String[] str = s.split("");

        Map<String, Integer> brackets = new HashMap<>();
        brackets.put(")", 1);
        brackets.put("(", -1);
        brackets.put("[", 2);
        brackets.put("]", -2);
        brackets.put("{", 3);
        brackets.put("}", -3);

        Stack<Integer> stack = new Stack<>();
        for (int k = 0; k < str.length; k++){
            if (str.length == 1){
                return false;
            }
            if (str[k].equals("(") || str[k].equals("[") || str[k].equals("{")){
                stack.push(brackets.get(str[k]));
            } else {
                if (!stack.isEmpty()){
                    int lastElement = stack.pop();
                    if (Math.abs(lastElement)!=Math.abs(brackets.get(str[k]))){
                        return false;
                    }  
                } else {
                    return false;
                }
            }
        }
        if (!stack.isEmpty()){
            return false;
        } else {
            return true;
        }
    }
}
// @lc code=end

