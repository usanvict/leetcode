import java.util.HashMap;

/*
 * @lc app=leetcode id=299 lang=java
 *
 * [299] Bulls and Cows
 */

// @lc code=start
class Solution {
    public String getHint(String secret, String guess) {

        HashMap<String, Integer> guessMap = new HashMap<>();

        String[] secretSplit = secret.split("");
        String[] guessSplit = guess.split("");

        int bulls = 0;
        int cows = 0;

        for (int i = 0; i < guessSplit.length; i++){
            if (!guessMap.containsKey(guessSplit[i])){
                guessMap.put(guessSplit[i], 1);
            } else {
                guessMap.put(guessSplit[i], guessMap.get(guessSplit[i])+1);
            }
        }

        for (int k = 0; k < guessSplit.length; k++){
            if (guessSplit[k].equals(secretSplit[k])){
                bulls += 1;
                guessMap.put(secretSplit[k], guessMap.get(secretSplit[k])-1);
            }
        }

        for (int l = 0; l < guessSplit.length; l++){
            if (!guessSplit[l].equals(secretSplit[l]) && guessMap.containsKey(secretSplit[l]) && guessMap.get(secretSplit[l])!=0){
                cows += 1;
                guessMap.put(secretSplit[l], guessMap.get(secretSplit[l])-1);
            }
        }

        return bulls + "A" + cows + "B";
        
    }

    // public static void main(String[] args) {
    //     var sol = new Solution();
    //     sol.getHint("11", "01");
    // }
}
// @lc code=end
