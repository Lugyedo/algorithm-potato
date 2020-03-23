package com.potato.design.pattern.decorator;

import com.potato.design.pattern.decorator.tree.Tree;

/**
 * @author dehuab
 */
public class AppleTree implements Tree {
    @Override
    public String decorate() {
        return "Apple tree";
    }
}
