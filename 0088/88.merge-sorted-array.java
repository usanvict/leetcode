/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if (n == 0) {
            return;
        }

        if (m == 0) {
            for (int p = 0; p < n; p++) {
                nums1[p] = nums2[p];
            }
            return;
        }

        int index2 = 0;

        for (int k = 0; k < nums1.length; k++) {
            if (index2 == n) {
                return;
            }
            if ((k + 1) != nums1.length) {
                if (nums2[index2] >= nums1[k] && nums2[index2] <= nums1[k + 1]) {
                    for (int l = nums1.length - 1; l >= k + 1; l--) {
                        if (l + 1 < nums1.length){
                            nums1[l + 1] = nums1[l];
                        }
                    }
                    nums1[k + 1] = nums2[index2];
                    index2 += 1;
                    m += 1;
                } else if (nums2[index2] <= nums1[k]) {
                    for (int l = nums1.length - 1; l >= k; l--) {
                        if (l + 1 < nums1.length){
                            nums1[l + 1] = nums1[l];
                        }
                    }
                    nums1[k] = nums2[index2];
                    index2 += 1;
                    m+=1;
                } else if (nums1[k] == 0 && k >= m) {
                    nums1[k] = nums2[index2];
                    index2 += 1;
                }
            } else {
                nums1[k] = nums2[index2];
            }
        }

    }
}
// @lc code=end
