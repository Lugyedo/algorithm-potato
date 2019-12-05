package com.potato.jvm;

/**
 * @author dehuab
 */
public class MethodInvoke {
    public static void main(String[] args) {
        // 调用第二个invoke方法
        invoke(null, 1);
        // 调用第二个invoke方法
        invoke(null, 1, 2);
        // 只有手动绕开可变长参数的语法糖，才能调用第一个invoke方法
        invoke(null, new Object[]{1});
    }

    private static void invoke(Object obj, Object... args) {
        System.out.println("Object Object...");
    }

    private static void invoke(String s, Object obj, Object... args) {
        System.out.println("String Object Object...");
    }
}
