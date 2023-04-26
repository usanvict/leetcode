#
# @lc app=leetcode id=205 lang=python3
#
# [205] Isomorphic Strings
#

# @lc code=start
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s1 = list([*s])
        t1 = list([*t])

        results = {}

        for index, value in enumerate(s1):
            if s1[index] not in results:
                if t1[index] not in results.values():
                    results.update({s1[index]: t1[index]})
                else:
                    return False
            elif results.get(s1[index]) != t1[index]:
                    return False

        return True


# @lc code=end
