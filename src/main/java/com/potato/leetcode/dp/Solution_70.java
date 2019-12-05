package com.potato.leetcode.dp;

/**
 * @author dehuab
 * https://leetcode-cn.com/problems/climbing-stairs/
 * 爬楼梯
 */
public class Solution_70 {
    public static void main(String[] args) {
        Solution_70 solution = new Solution_70();
        int result = solution.climbStairs(3);
        System.out.println(result);
    }

    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int[] result = new int[n];
        result[0] = 1;
        result[1] = 2;

        int i = 2;
        while (i < n) {
            result[i] = result[i - 1] + result[i - 2];
            i++;
        }

        return result[n - 1];
    }

}
