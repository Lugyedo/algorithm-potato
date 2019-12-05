package com.potato.leetcode.dp;

/**
 * @author dehuab
 * https://leetcode-cn.com/problems/house-robber/submissions/
 * 打家劫舍
 * <p>
 * DP状态定义：
 * result[i][0]-不偷窃第i个房屋的最高金额
 * result[i][1]-偷窃第i个房屋的最高金额
 * <p>
 * DP状态转移方程：
 * result[i][0] = Math.max(result[i - 1][0], result[i - 1][1])
 * result[i][1] = result[i - 1][0] + nums[i];
 */
public class Solution_198 {
    public static void main(String[] args) {
        Solution_198 solution = new Solution_198();
        int rob = solution.rob(new int[]{1, 2, 3, 1});
        System.out.println(rob);
    }

    private int rob(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return 0;
        }

        int[][] result = new int[nums.length][2];
        result[0][0] = 0;
        result[0][1] = nums[0];

        int i = 1;
        int length = nums.length;
        while (i < length) {
            result[i][0] = Math.max(result[i - 1][0], result[i - 1][1]);
            result[i][1] = result[i - 1][0] + nums[i];
            i++;
        }

        return Math.max(result[nums.length - 1][0], result[nums.length - 1][1]);
    }
}
