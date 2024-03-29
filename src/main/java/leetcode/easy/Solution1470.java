package leetcode.easy;

public class Solution1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            ans[i * count] = nums[i];
            ans[i * count + 1] = nums[i + n];
            count++;
        }
        return ans;
    }
}
