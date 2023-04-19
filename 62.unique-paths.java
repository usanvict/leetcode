/*
 * @lc app=leetcode id=62 lang=java
 *
 * [62] Unique Paths
 */

// @lc code=start
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] visited = new int[m][n];

        if (m == 0 || n == 0){
            return 0;
        }
        if (m == 1 || n == 1){
            return 1;
        }

        for (int i = 0; i < m; i++) {
            visited[i][0] = 1;
        }

        // top row
        for (int j = 0; j < n; j++) {
            visited[0][j] = 1;
        }

        // fill up the dp table
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                visited[i][j] = visited[i - 1][j] + visited[i][j - 1];
            }
        }

        return visited[m - 1][n - 1];
    }

}
// @lc code=end
