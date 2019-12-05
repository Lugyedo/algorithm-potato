package com.potato;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        System.out.println(new BigDecimal("100.000").stripTrailingZeros().toPlainString());
    }
}
