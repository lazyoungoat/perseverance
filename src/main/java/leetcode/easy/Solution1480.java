package leetcode.easy;

public class Solution1480 {
    public int[] runningSum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
            } else
                nums[i] += nums[i - 1];
        }
        return nums;
    }
}
