package com.potato.design.pattern;

import com.potato.design.pattern.decorator.AppleTree;
import com.potato.design.pattern.decorator.AppleTreeDecorator1;
import com.potato.design.pattern.decorator.AppleTreeDecorator2;
import com.potato.design.pattern.decorator.tree.BubbleLights;
import com.potato.design.pattern.decorator.tree.ChristmasTree;
import com.potato.design.pattern.decorator.tree.Garland;
import com.potato.design.pattern.decorator.tree.Tree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreeDecoratorTest {
    @Test
    public void testTreeDecorator() {
        Tree tree = new AppleTreeDecorator2(new AppleTreeDecorator1(new AppleTree()));
        assertEquals("Apple tree with AppleTreeDecorator1 with AppleTreeDecorator2", tree.decorate());
    }

    @Test
    public void whenDecoratorsInjectedAtRuntime_thenConfigSuccess() {
        Tree tree1 = new Garland(new ChristmasTree());
        assertEquals("Christmas tree with Garland", tree1.decorate());

        Tree tree2 = new BubbleLights(new Garland(new Garland(new ChristmasTree())));
        assertEquals("Christmas tree with Garland with Garland with Bubble Lights", tree2.decorate());
    }
}
