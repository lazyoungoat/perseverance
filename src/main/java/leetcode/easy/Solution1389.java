package leetcode.easy;

public class Solution1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (target[index[i]] == 0) {
                target[index[i]] = nums[i];
            }else {
                while(target[index[i]++]!=0){
                    int tmp = target[index[i]++];
                    target[index[i]++] = target[index[i]];
                    target[index[i]+=2] = tmp;
                }
            }
        }
        return target;
    }
}
