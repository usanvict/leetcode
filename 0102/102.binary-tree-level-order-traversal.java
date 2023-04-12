import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=102 lang=java
 *
 * [102] Binary Tree Level Order Traversal
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    List<List<Integer>> results = new ArrayList<>();

    int height(TreeNode root) {
        if (root == null)
            return 0;
        else {
            int lheight = height(root.left);
            int rheight = height(root.right);

            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }

    void printCurrentLevel(TreeNode root, int level, List<Integer> list) {
        if (root == null){
            return;
        }

        if (level == 1){
            list.add(root.val);
        } else if (level > 1) {
            printCurrentLevel(root.left, level - 1, list);
            printCurrentLevel(root.right, level - 1, list);
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        int h = height(root);
        int i;

        for (i = 1; i <= h; i++){
            List<Integer> result1 = new ArrayList<>();
            printCurrentLevel(root, i, result1);
            results.add(result1);
        }

        return results;
    }

}
// @lc code=end
