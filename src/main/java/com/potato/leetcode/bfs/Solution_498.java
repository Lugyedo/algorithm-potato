package com.potato.leetcode.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author dehuab
 * https://leetcode-cn.com/problems/diagonal-traverse/
 * 对角线遍历
 */
public class Solution_498 {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length <= 0 || matrix[0].length <= 0) {
            return null;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int[] result = new int[m * n];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(matrix[0][0]);
        int currentLevel = 0;

        while (!queue.isEmpty()) {
            result[0] = queue.poll();

            int i = currentLevel >= n ? n : 0;
            if (currentLevel > n) {

            }

            currentLevel++;
        }

        List<Integer> r = new ArrayList<>(m * n);
        int i = 0;
        int j = 0;
        while (true) {
            if (currentLevel >> 1 > 0) {
                i = 0;
                while (i < m) {
                    r.add(matrix[i][currentLevel - i]);
                    i++;
                }
            } else {
                j = 0;
            }
            currentLevel++;
        }


        //return result;
    }
}
