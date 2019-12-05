package com.potato.leetcode.sort;

/**
 * @author dehuab
 * https://leetcode-cn.com/problems/sort-an-array/
 */
public class Solution_912 {
    public int[] sortArray(int[] nums) {
        return quickSort(nums, 0, nums.length - 1);
    }

    /**
     * 快速排序
     *
     * @param nums
     * @return
     */
    private int[] quickSort(int[] nums, int left, int right) {
        if (left >= right) {
            return nums;
        }

        int pivotIndex = partition(nums, left, right);
        quickSort(nums, left, pivotIndex - 1);
        quickSort(nums, pivotIndex + 1, right);
        return nums;
    }

    private int partition(int[] nums, int left, int right) {
        int pivot = nums[right];

        int i = left;
        for (int j = left; j < right; j++) {
            if (nums[j] < pivot) {
                swap(nums, i, j);
                i++;
            }
        }

        swap(nums, i, right);
        return i;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[j];
        nums[j] = nums[i];
        nums[i] = tmp;
    }
}
