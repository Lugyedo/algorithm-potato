package com.potato.leetcode.tree;


import com.potato.leetcode.model.TreeNode;

/**
 * @author dehuab
 * 111. 二叉树的最小深度
 */
public class MinDepthSolution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftMinDepth = minDepth(root.left);
        int rightMinDepth = minDepth(root.right);

        if (leftMinDepth == 0 || rightMinDepth == 0) {
            return leftMinDepth + rightMinDepth + 1;
        } else {
            return Math.min(leftMinDepth, rightMinDepth) + 1;
        }
    }
}
