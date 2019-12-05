package com.potato.leetcode.dp;

/**
 * @author dehuab
 * https://leetcode-cn.com/problems/unique-binary-search-trees/comments/
 * 不同的二叉搜索树
 */
public class Solution_96 {
    public static void main(String[] args) {
        Solution_96 solution = new Solution_96();
        System.out.println(solution.numTrees(3));
    }

    public int numTrees(int n) {
        if (n <= 2) {
            return n;
        }

        int num = 0;

        int[] result = new int[n];
        result[0] = 1;
        result[1] = 2;

        for (int i = 2; i < n; i++) {
            //int k = i - 1;
            for (int j = 0; j <= i; j++) {
                result[i] += result[j] * result[i - j];
            }
        }

        return result[n - 1];
    }
}

