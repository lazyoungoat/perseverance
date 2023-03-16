package leetcode.easy;

public class Solution771 {
    public int numJewelsIsInStones(String jewels, String stones) {
        int isJewel = 0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j)) {
                    isJewel++;
                }
            }
        }
        return isJewel;
    }
}
