package com.potato;

import java.util.UUID;

/**
 * @author dehuab
 */
public class GenerateUUID {
    public static void main(String[] args) {
        int i = 0;
        while (i < 1497) {
            System.out.println(UUID.randomUUID());
            i++;
        }
    }
}
