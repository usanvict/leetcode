import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=142 lang=java
 *
 * [142] Linked List Cycle II
 */

// @lc code=start

// class ListNode {
//     int val;
//     ListNode next;

//     ListNode(int x) {
//         val = x;
//         next = null;
//     }
// }

public class Solution {
    public ListNode detectCycle(ListNode head) {

        List<ListNode> results = new ArrayList<>();

        ListNode current = head;
        while (current != null) {
            //System.out.println(current.val);
            if (!results.contains(current)){
                results.add(current);
            } else {
                return current;
            }
            current = current.next;
        }
    return null;
    }

}
// @lc code=end
