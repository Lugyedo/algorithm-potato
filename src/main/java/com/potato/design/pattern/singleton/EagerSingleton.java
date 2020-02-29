package com.potato.design.pattern.singleton;

/**
 * @author dehuab
 * 饿汉式单利模式
 * 饿汉式的实现方式，在类加载的期间，就已经将 instance 静态实例初始化好了，所以，instance 实例的创建是线程安全的。
 * 不过，这样的实现方式不支持延迟加载实例。
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}