/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = new ListNode();

        if (list1 != null) {
            if (list2 != null) {
                if (list1.val <= list2.val) {
                    head = list1;
                    list1 = list1.next;
                } else if (list1.val > list2.val) {
                    head = list2;
                    list2 = list2.next;
                }
            } else {
                return list1;
            }
        } else {
            return list2;
        }

        ListNode current = head;
        while (list1 != null || list2 != null) {
            if (list2 == null || (list1 != null && list1.val <= list2.val)) {
                current.next = list1;
                current = current.next;
                list1 = list1.next;
            } else {
                current.next = list2;
                current = current.next;
                list2 = list2.next;
            }
        }

        return head;

    }
    
}
// @lc code=end
