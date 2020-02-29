package com.potato.design.pattern;

import com.potato.design.pattern.singleton.DoubleCheckedSingleton;
import com.potato.design.pattern.singleton.EagerSingleton;
import com.potato.design.pattern.singleton.LazySingleton;
import com.potato.design.pattern.singleton.StaticNestedSingleton;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class SingletonTest {
    @Test
    public void testGetSingleton() {
        EagerSingleton.getInstance();
        LazySingleton.getInstance();
        DoubleCheckedSingleton.getInstance();
        StaticNestedSingleton instance = StaticNestedSingleton.getInstance();
        assertNotNull(instance);
    }
}
