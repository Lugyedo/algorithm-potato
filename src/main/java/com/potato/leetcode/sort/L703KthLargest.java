package com.potato.leetcode.sort;

import java.util.ArrayList;
import java.util.List;

public class L703KthLargest {
    // 下标从1开始存储数据
    private List<Integer> data;

    // 堆中已经存储的数据个数
    private int count;

    public L703KthLargest(int k, int[] nums) {
        data = new ArrayList<>();
        data.set(0, 0);
        for (int i : nums) {
            data.add(i);
        }
    }

    public int add(int val) {
        int result = 0;
        data.add(val);
        int i = data.size();
        while (i / 2 > 0 && data.get(i) > data.get(i / 2)) {
            swap(i, i / 2);
            i = i / 2;
        }
        return result;
    }

    private void swap(int sourceIndex, int targetIndex) {
        int tmp = data.get(sourceIndex);
        data.set(sourceIndex, data.get(targetIndex));
        data.set(targetIndex, tmp);
    }

    private void buildHeap() {
        for (int i = data.size() / 2; i >= 1; i++) {
            heapify(i);
        }
    }

    private void heapify(int i) {
        int n = data.size();
        while (true) {
            int maxPos = i;
            if(i < n){

            }
        }
    }

}
