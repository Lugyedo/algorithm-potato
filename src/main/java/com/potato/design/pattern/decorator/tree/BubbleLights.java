package com.potato.design.pattern.decorator.tree;

/**
 * @author dehuab
 */
public class BubbleLights extends AbstractTreeDecorator {
    public BubbleLights(Tree tree) {
        super(tree);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights() {
        return " with Bubble Lights";
    }
}
