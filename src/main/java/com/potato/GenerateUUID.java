package com.potato;

import java.util.UUID;

/**
 * @author dehuab
 */
public class GenerateUUID {
    public static void main(String[] args) {
        int i = 0;
        while (i < 3) {
            System.out.println(UUID.randomUUID());
            i++;
        }
    }
}
