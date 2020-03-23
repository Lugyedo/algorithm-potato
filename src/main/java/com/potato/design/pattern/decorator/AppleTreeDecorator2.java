package com.potato.design.pattern.decorator;

import com.potato.design.pattern.decorator.tree.Tree;

/**
 * @author dehuab
 */
public class AppleTreeDecorator2 implements Tree {
    private Tree tree;

    public AppleTreeDecorator2(Tree tree) {
        this.tree = tree;
    }

    @Override
    public String decorate() {
        return tree.decorate() + " with AppleTreeDecorator2";
    }
}
