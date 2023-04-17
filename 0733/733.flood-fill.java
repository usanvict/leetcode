import java.util.Stack;

/*
 * @lc app=leetcode id=733 lang=java
 *
 * [733] Flood Fill
 */

// @lc code=start
class Solution {

    public boolean isValid(int[][] image, int sr, int sc, int toFill) {
        return sr >= 0 && sr < image.length && sc >= 0 && sc < image[sr].length && image[sr][sc] == toFill;
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        Stack<int[]> stack = new Stack<>();

        int toFill = image[sr][sc];

        if (toFill == color){
            return image;
        }

        stack.push(new int[] { sr, sc });

        while (!stack.isEmpty()) {
            int[] n = stack.pop();
            image[n[0]][n[1]] = color;

            if (isValid(image, n[0] + 1, n[1], toFill)) {
                int[] b = new int[] { n[0] + 1, n[1] };
                stack.push(b);
            }
            if (isValid(image, n[0] - 1, n[1], toFill)) {
                int[] c = new int[] { n[0] - 1, n[1] };
                stack.push(c);
            }
            if (isValid(image, n[0], n[1] + 1, toFill)) {
                int[] d = new int[] { n[0], n[1] + 1 };
                stack.push(d);
            }
            if (isValid(image, n[0], n[1] - 1, toFill)) {
                int[] e = new int[] { n[0], n[1] - 1 };
                stack.push(e);
            }

        }

        return image;
    }
}
// @lc code=end
