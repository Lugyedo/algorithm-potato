package com.potato.leetcode.dp;

/**
 * @author dehuab
 * https://leetcode-cn.com/problems/maximum-subarray/
 * 最大子序和
 * <p>
 * DP状态定义：
 * result[i][0]-第i个元素不重新开始的最大和，把自己的值加入
 * result[i][1]-第i个元素重新开始的最大和
 * <p>
 * DP状态转移方程：
 * result[i][0] = Math.max(result[i - 1][0], result[i - 1][1]) + nums[i]
 * result[i][1] = nums[i];
 */
public class Solution_53 {
    public static void main(String[] args) {
        Solution_53 solution = new Solution_53();
        System.out.println(solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}) + " Expect=6");
    }

    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return 0;
        }

        int[][] result = new int[nums.length][2];
        result[0][0] = nums[0];
        result[0][1] = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            result[i][0] = Math.max(result[i - 1][0], result[i - 1][1]) + nums[i];
            result[i][1] = nums[i];
            max = Math.max(max, Math.max(result[i][0], result[i][1]));
        }

        return max;
    }
}
