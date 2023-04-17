import java.nio.channels.NetworkChannel;

/*
 * @lc app=leetcode id=200 lang=java
 *
 * [200] Number of Islands
 */

// @lc code=start
class Solution {

    boolean[][] visited;
    int count = 0;

    public boolean isValid(char[][] grid, boolean[][] image, int sr, int sc) {
        return sr >= 0 && sr < image.length && sc >= 0 && sc < image[sr].length && !image[sr][sc]
                && grid[sr][sc] == '1';
    }

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        boolean[][] visited = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int k = 0; k < grid[i].length; k++) {
                if (grid[i][k] == '1' && visited[i][k] == false) {
                    count += 1;
                    dfs(grid, visited, i, k);
                }
            }
        }
        return count;
    }

    public void dfs(char[][] grid, boolean[][] visited, int i, int k) {
        visited[i][k] = true;
        if (isValid(grid, visited, i, k + 1)) {
            dfs(grid, visited, i, k + 1);
        }
        if (isValid(grid, visited, i, k - 1)) {
            dfs(grid, visited, i, k - 1);
        }
        if (isValid(grid, visited, i + 1, k)) {
            dfs(grid, visited, i + 1, k);
        }
        if (isValid(grid, visited, i - 1, k)) {
            dfs(grid, visited, i - 1, k);
        }
    }

    // public static void main(String[] args) {
    //     var sol = new Solution();
    //     char grid[][] = new char[][] { { '1', '1', '1', '1', '0' },
    //             { '1', '1', '0','1', '1' },
    //             { '1', '1', '0', '0', '0' },
    //             { '0', '0', '0', '0', '0' } };
    //     sol.numIslands(grid);
    // }
}
// @lc code=end
