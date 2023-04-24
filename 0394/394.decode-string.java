import java.util.Stack;

import javax.xml.transform.stax.StAXResult;

/*
 * @lc app=leetcode id=394 lang=java
 *
 * [394] Decode String
 */

// @lc code=start
class Solution {

    Stack<String> result = new Stack<>();
    int pointer = 0;

    public boolean isNumber(String i){
        try{
            Integer number = Integer.valueOf(i);
            return true;
        }
        catch (NumberFormatException ex){
            return false;
        }
    }

    public void returnString(int k){
        
    }

    public String decodeString(String s) {

        String[] ss = s.split("");

        for (int i = pointer; i < ss.length; i++){
            if (isNumber(ss[i])){
                int k = Integer.parseInt(ss[i]);
                pointer = i+1;
                result.add(decodeString(s));
            } else if (ss[i].equals("[") || ss[i].equals("]")) {
                continue;
            } else {
                return ss[i];
            }
        }

        return result.toString();
        
    }

    public static void main(String[] args) {
        var sol = new Solution();
        sol.decodeString("3[a]2[bc]");
    }
}
// @lc code=end

