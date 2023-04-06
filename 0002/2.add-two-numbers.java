/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode();
        ListNode current = result;

        while (l1 != null || l2 != null) {
            int current1 = l1 != null ? l1.val : 0;
            int current2 = l2 != null ? l2.val : 0;

            int temp = current1 + current2 + current.val;
            current.val = temp % 10;

            ListNode increment = new ListNode(temp > 9 ? 1 : 0);

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;

            if (l1 != null || l2 != null || increment.val > 0) {
                current.next = increment;
            }

            current = increment;

        }

        return result;
    }
}
// @lc code=end
