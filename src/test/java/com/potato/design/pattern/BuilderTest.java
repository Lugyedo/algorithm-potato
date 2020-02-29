package com.potato.design.pattern;

import com.potato.design.pattern.builder.ResourcePoolConfig;
import org.junit.Assert;
import org.junit.Test;

public class BuilderTest {
    @Test
    public void ResourcePoolConfigBuildTest() {
        ResourcePoolConfig config = new ResourcePoolConfig.Builder()
                .setName("dbconnectionpool")
                .setMaxTotal(16)
                .setMaxIdle(10)
                .setMinIdle(6)
                .build();
        Assert.assertNotNull(config);
        Assert.assertTrue(config.getMinIdle() < config.getMaxIdle());
    }
}
