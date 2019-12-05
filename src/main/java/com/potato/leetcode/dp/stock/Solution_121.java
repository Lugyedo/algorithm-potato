package com.potato.leetcode.dp.stock;

/**
 * @author dehuab
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 * 买卖股票的最佳时机
 * <p>
 * DP状态定义：
 * result[i][0] 第i天卖出的收益
 * result[i][1] 第i天买入的收益
 * <p>
 * 状态转移方程：
 * result[i][0] = result[i-1][0]
 */
public class Solution_121 {
    public int maxProfit(int[] prices) {
        int r = 0;

        int[][] result = new int[prices.length][2];


        return r;
    }
}
