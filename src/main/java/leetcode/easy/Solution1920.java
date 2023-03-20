package leetcode.easy;

public class Solution1920 {
    public int[] buildArray(int[] nums) {

        int[] ans = new int[nums.length];

        if (1 <= nums.length && nums.length <= 1000) {
            for (int i = 0; i < nums.length; i++) {
                if (0 <= nums[i] && nums[i] <= nums.length) {
                    ans[i] = nums[nums[i]];
                }
            }
        }
        return ans;
    }
}
