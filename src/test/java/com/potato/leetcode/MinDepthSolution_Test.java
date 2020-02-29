package com.potato.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class MinDepthSolution_Test {
    @Test
    public void test() {
        //MinDepthSolution leetCode_104_036 = new MinDepthSolution();
        //leetCode_104_036.maxDepth();

        String urlPath = "/crm-mobile-web//api/hotel/buildUserOptions";
        String url = urlPath.replaceAll("/crm-mobile-web/", "").substring(1);
        Assert.assertNotNull(url);
    }
}
