package com.potato.design.pattern;

import com.potato.design.pattern.decorator.BubbleLights;
import com.potato.design.pattern.decorator.ChristmasTree;
import com.potato.design.pattern.decorator.Garland;
import com.potato.design.pattern.decorator.Tree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreeDecoratorTest {
    @Test
    public void whenDecoratorsInjectedAtRuntime_thenConfigSuccess() {
        Tree tree1 = new Garland(new ChristmasTree());
        assertEquals("Christmas tree with Garland", tree1.decorate());

        Tree tree2 = new BubbleLights(new Garland(new Garland(new ChristmasTree())));
        assertEquals("Christmas tree with Garland with Garland with Bubble Lights", tree2.decorate());
    }
}
