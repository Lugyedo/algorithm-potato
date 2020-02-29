package com.potato.design.pattern.decorator;

/**
 * @author dehuab
 * https://www.baeldung.com/java-decorator-pattern
 */
public class ChristmasTree implements Tree {
    @Override
    public String decorate() {
        return "Christmas tree";
    }
}
