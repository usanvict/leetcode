import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * @lc app=leetcode id=438 lang=java
 *
 * [438] Find All Anagrams in a String
 */

// @lc code=start
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<String, Integer> anagrams = new HashMap<>();

        String[] sSplit = s.split("");
        String[] pSplit = p.split("");

        List<Integer> count = new ArrayList<>();

        if (pSplit.length > sSplit.length) {
            return count;
        }

        HashMap<String, Integer> frequency = new HashMap<>();

        for (int k = 0; k < pSplit.length; k++) {
            if (!frequency.containsKey(pSplit[k])) {
                frequency.put(pSplit[k], 1);
            } else {
                frequency.put(pSplit[k], frequency.get(pSplit[k])+1);
            }
        }

        for (int i = 0; i < pSplit.length; i++) {
            if (!anagrams.containsKey(sSplit[i])) {
                anagrams.put(sSplit[i], 1);
            } else {
                anagrams.put(sSplit[i], anagrams.get(sSplit[i])+1);
            }
        }

        if (frequency.equals(anagrams)) {
            count.add(0);
        }

        for (int z = pSplit.length; z < sSplit.length; z++) {
            if ((anagrams.get(sSplit[z - pSplit.length]) - 1) == 0){
                anagrams.remove(sSplit[z - pSplit.length]);
            } else {
                anagrams.put(sSplit[z - pSplit.length], anagrams.get(sSplit[z - pSplit.length]) - 1);
            }

            
            anagrams.put(sSplit[z], anagrams.getOrDefault(sSplit[z], 0) + 1);

            if (frequency.equals(anagrams)) {
                count.add(z - pSplit.length + 1);
            }
        }

        return count;
    }
}
// @lc code=end
