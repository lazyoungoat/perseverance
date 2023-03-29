package leetcode.easy;

public class Solution1480 {
    public int[] runningSum(int[] nums){
        int[] runningSums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i+1; j++) {
                runningSums[i] += nums[j];
            }
        }
        return runningSums;
    }
}
