package com.potato;

public class SystemUtil {
    public static void main(String[] args) {
        System.out.println(isAdmin("Admin"));
    }

    public static boolean isAdmin(String userId) {
        return userId.toLowerCase() == "admin";
    }
}
