package com.potato.leetcode.find;

/**
 * @author dehuab
 * https://leetcode-cn.com/problems/binary-search/
 */
public class Solution_705 {
    public static void main(String[] args) {
        Solution_705 solution = new Solution_705();
        int r = solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 12);
        System.out.println(r);
    }

    public int search(int[] nums, int target) {
        if (nums == null || nums.length <= 0) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
