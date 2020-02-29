package com.potato.design.pattern.singleton;

/**
 * @author dehuab
 * 懒汉式单利模式
 * 懒汉式相对于饿汉式的优势是支持延迟加载。
 * getInstance() 这个方法加了一把大锁（synchronzed），导致这个函数的并发度很低。
 * 这种实现方式会导致频繁加锁、释放锁，以及并发度低等问题，频繁的调用会产生性能瓶颈。
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
            System.out.println("懒汉式单利初始化");
        }
        return instance;
    }


    /**
     * 什么是好工作
     * “好工作”随时在变，连你最高瞻远瞩的预测都可能被打脸
     * 1、有发展，未来可以Cover住家庭的收入
     * 2、滴滴简历，内推
     * 3、去掉头部的公司能做什么
     * <p>
     * 可以做自己的事情
     * 年龄的问题
     * 准备一年：加班不回家，周末不回家
     * <p>
     * <p>
     * 给一年的时间试错
     *
     * @return
     */
    private boolean getFlag() {
        return Boolean.TRUE;
    }


}