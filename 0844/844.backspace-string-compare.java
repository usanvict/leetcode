import java.util.Stack;

/*
 * @lc app=leetcode id=844 lang=java
 *
 * [844] Backspace String Compare
 */

// @lc code=start
class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<String> ss = new Stack<>();
        Stack<String> ts = new Stack<>();

        String[] sSplit = s.split("");
        String[] tSplit = t.split("");

        for (int i = 0; i < sSplit.length; i++){
            if (!sSplit[i].equals("#")){
                ss.push(sSplit[i]);
            } else {
                if (!ss.empty()){
                    ss.pop();
                }
            }
        }

        for (int i = 0; i < tSplit.length; i++){
            if (!tSplit[i].equals("#")){
                ts.push(tSplit[i]);
            } else {
                if (!ts.empty()){
                    ts.pop();
                }
            }
        }

        if (ss.equals(ts)){
            return true;
        }

        return false;
        
    }
}
// @lc code=end

