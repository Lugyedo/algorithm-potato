package com.potato;

import com.potato.leetcode.tree.LeetCode_104_036;
import org.junit.Assert;
import org.junit.Test;

public class LeetCode_104_036_Test {
    @Test
    public void test(){
        //LeetCode_104_036 leetCode_104_036 = new LeetCode_104_036();
        //leetCode_104_036.maxDepth();

        String urlPath = "/crm-mobile-web//api/hotel/buildUserOptions";
        String url = urlPath.replaceAll("/crm-mobile-web/","").substring(1);
        Assert.assertNotNull(url);
    }
}
