package com.potato.leetcode.tree;

import com.potato.leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author dehuab
 * 二叉树层次遍历
 */
public class LevelOrderSolution {
    /**
     * 广度优先遍历BFS
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrderBFS(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> currentLevel = new ArrayList<>();

            int levelSize = queue.size();
            while (levelSize > 0) {
                TreeNode node = queue.poll();

                currentLevel.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }

                levelSize--;
            }

            res.add(currentLevel);
        }

        return res;
    }

    /**
     * 深度度优先遍历BFS
     * 执行用时 :1 ms, 在所有 Java 提交中击败了100.00%的用户
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrderDFS(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        levelOrderDFS(res, root, 0);
        return res;
    }

    private void levelOrderDFS(List<List<Integer>> res, TreeNode node, int level) {
        if (node == null) {
            return;
        }

        if (res.size() < level + 1) {
            res.add(new ArrayList<Integer>());
        }

        res.get(level).add(node.val);
        levelOrderDFS(res, node.left, level + 1);
        levelOrderDFS(res, node.right, level + 1);
    }
}
