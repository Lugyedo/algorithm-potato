package com.potato.design.pattern.decorator.tree;

/**
 * @author dehuab
 */
public abstract class AbstractTreeDecorator implements Tree {
    private Tree tree;

    AbstractTreeDecorator(Tree tree) {
        this.tree = tree;
    }

    @Override
    public String decorate() {
        return tree.decorate();
    }
}
