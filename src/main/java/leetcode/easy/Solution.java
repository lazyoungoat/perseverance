package leetcode.easy;

public class Solution {
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4};
        int[] index = {0, 1, 2, 1};
        int[] target = new int[index.length];
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
        for (int i = 0; i < target.length; i++) {
            System.out.println(target[i]);
        }
    }
}
