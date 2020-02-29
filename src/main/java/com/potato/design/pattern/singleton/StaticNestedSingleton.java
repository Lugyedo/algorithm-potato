package com.potato.design.pattern.singleton;

/**
 * @author dehuab
 * 静态内部类单利模式
 * 利用 Java 的静态内部类来实现单例。这种实现方式，既支持延迟加载，也支持高并发，实现起来也比双重检测简单。
 * SingletonHolder 是一个静态内部类，当外部类被加载的时候，并不会创建 SingletonHolder 实例对象。
 * 只有当调用 getInstance() 方法时，SingletonHolder 才会被加载，这个时候才会创建 instance。
 * insance 的唯一性、创建过程的线程安全性，都由 JVM 来保证。所以，这种实现方法既保证了线程安全，又能做到延迟加载。
 */
public class StaticNestedSingleton {
    private StaticNestedSingleton() {
    }

    public static StaticNestedSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final StaticNestedSingleton INSTANCE = new StaticNestedSingleton();
    }
}
