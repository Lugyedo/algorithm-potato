package com.potato.design.pattern.decorator.tree;

/**
 * @author dehuab
 */
public class Garland extends AbstractTreeDecorator {
    public Garland(Tree tree) {
        super(tree);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithGarland();
    }

    private String decorateWithGarland() {
        return " with Garland";
    }
}
