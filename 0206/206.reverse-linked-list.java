/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
 */

// @lc code=start
// class ListNode {
//     int val;
//     ListNode next;

//     ListNode() {
//     }

//     ListNode(int val) {
//         this.val = val;
//     }

//     ListNode(int val, ListNode next) {
//         this.val = val;
//         this.next = next;
//     }
// }

class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode current = head;
        ListNode previous = null;

        while (current!=null){
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
        
    }

    // public static void main(String[] args) {
    //     var sol = new Solution();
    //     int[] list1 = new int[]{1,2,3};

    //     ListNode head1 = new ListNode();
    //     ListNode current1 = head1;
    //     for (int k = 0; k < list1.length; k++){
    //         ListNode next = new ListNode(list1[k]);
    //         current1.next = next;
    //         current1 = next;
    //     }

    //     sol.reverseList(head1);

    //     var current = head1;
    //     while(current != null){
    //         System.out.println(current.val);
    //         current = current.next;
    //     }
    // }
}
// @lc code=end

