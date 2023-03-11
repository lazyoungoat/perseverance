package leetcode.easy;

public class Solution2574 {
    public int[] leftRightDifference(int[] nums) {
        int[] answer = new int[nums.length];
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                leftSum[i] = 0;
            } else {
                leftSum[i] = leftSum[i - 1] + nums[i - 1];
            }
        }
        for (int j = nums.length - 1; j > -1; j--) {
            if (j == nums.length - 1) {
                rightSum[nums.length - 1] = 0;
            } else {
                rightSum[j] = rightSum[j + 1] + nums[j + 1];
            }
        }
        for (int k = 0; k < nums.length; k++) {
            if (leftSum[k] - rightSum[k] < 0) {
                answer[k] = -(leftSum[k] - rightSum[k]);
            }else {
                answer[k] = leftSum[k] - rightSum[k];
            }
        }
        return answer;
    }
}
