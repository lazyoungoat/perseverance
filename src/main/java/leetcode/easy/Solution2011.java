package leetcode.easy;

public class Solution2011 {
    public int finalValueAfterOperations(String[] operations){
        int X = 0;
        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "--X" -> X--;
                case "X--" -> X--;
                case "++X" -> X++;
                case "X++" -> X++;
            }
        }
        for (String operation : operations) {
            switch (operation) {
                case "--X" -> X--;
                case "X--" -> X--;
                case "++X" -> X++;
                case "X++" -> X++;
            }
        }
        return X;
    }
}
