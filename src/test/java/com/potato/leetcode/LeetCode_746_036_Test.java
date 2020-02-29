package com.potato.leetcode;

import com.potato.leetcode.LeetCode_746_036;
import org.junit.Assert;
import org.junit.Test;

public class LeetCode_746_036_Test {
    @Test
    public void test() {
        LeetCode_746_036 leetCode_746_036 = new LeetCode_746_036();
        int r = leetCode_746_036.minCostClimbingStairs(new int[]{0, 0, 1, 1});
        Assert.assertEquals(1, r);
    }
}
