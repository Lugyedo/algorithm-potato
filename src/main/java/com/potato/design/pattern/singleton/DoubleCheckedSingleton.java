package com.potato.design.pattern.singleton;

/**
 * @author dehuab
 * 双重检测单利模式
 * 双重检测实现方式既支持延迟加载、又支持高并发的单例实现方式。只要 instance 被创建之后，再调用 getInstance() 函数都不会进入到加锁逻辑中。
 * 所以，这种实现方式解决了懒汉式并发度低的问题。
 */
public class DoubleCheckedSingleton {
    private static volatile DoubleCheckedSingleton instance;

    private DoubleCheckedSingleton() {
    }

    public static DoubleCheckedSingleton getInstance() {
        if (instance == null) {
            // 此处为类级别的锁
            synchronized (DoubleCheckedSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedSingleton();
                    System.out.println("双重检测式单利初始化");
                }
            }
        }
        return instance;
    }
}
