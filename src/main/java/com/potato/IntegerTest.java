package com.potato;

public class IntegerTest {
    public static void main(String[] args) {
        Integer a = 8, b = 8;
        System.out.println(a == b ? true : false);

        Integer c = 257, d = 257;
        System.out.println(c == d ? true : false);

        Integer e = new Integer(9), f = new Integer(9);
        System.out.println(e == f ? true : false);


        Integer x = 1;
        Integer y = 2;
        swap(x, y);
        System.out.println(String.format("x=%d, y=%d", x, y));

        int i = 1;
        int j = 2;
        swapPrimitive(i, j);
        System.out.println(String.format("i=%d, j=%d", i, j));
    }

    private static void swap(Integer a, Integer b) {
        Integer aTempValue = a;
        a = b;
        b = aTempValue;
    }

    private static void swapPrimitive(int i, int j) {
        int aTempValue = i;
        i = j;
        j = aTempValue;
    }
}
