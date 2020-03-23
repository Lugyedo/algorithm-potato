package com.potato.jvm;

import java.util.Date;

/**
 * @author dehuab
 */
public class RuntimeConstantPool {
    public static void main(String[] args) {
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);

        String str3 = "计算机软件";
        System.out.println(str3 == str1);

        System.out.println(new Date(2020,3,6,15,17,0).getTime());
    }
}
