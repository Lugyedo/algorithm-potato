package com.potato.design.pattern.decorator;

/**
 * @author dehuab
 *
 * <p>
 * 树装饰 https://www.baeldung.com/java-decorator-pattern
 * 图形装饰 https://dzone.com/articles/decorator-design-pattern-in-java
 * </p>
 * <p>
 * 装饰器模式与代理模式对比 https://stackoverflow.com/questions/18618779/differences-between-proxy-and-decorator-pattern
 * </p>
 */
public class ChristmasTree implements Tree {
    @Override
    public String decorate() {
        return "Christmas tree";
    }
}
