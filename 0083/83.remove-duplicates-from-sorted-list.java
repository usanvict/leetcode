/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
 */

// @lc code=start
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) {this.val = val;}
//     ListNode(int val, ListNode next) {this.val = val;this.next = next;}
// }

class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode result = head;

        while (result != null) {
            while (result.next != null && result.val == result.next.val) {
                result.next = result.next.next;
            }

            result = result.next;
        }

        return head;
    }

}
// @lc code=end
