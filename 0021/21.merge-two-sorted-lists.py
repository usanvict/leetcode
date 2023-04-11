#
# @lc app=leetcode id=21 lang=python
#
# [21] Merge Two Sorted Lists
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def mergeTwoLists(self, list1, list2):
        head = ListNode()

        if list1 != None:
            if list2 != None:
                if list1.val <= list2.val:
                    head = list1
                    list1 = list1.next
                elif list1.val > list2.val:
                    head = list2
                    list2 = list2.next
            else:
                return list1
        else:
            return list2

        current = head

        while list1 != None or list2 != None:
            if list2 == None or (list1 != None and list1.val <= list2.val):
                current.next = list1
                current = current.next
                list1 = list1.next
            else:
                current.next = list2
                current = current.next
                list2 = list2.next

        return head


# @lc code=end
