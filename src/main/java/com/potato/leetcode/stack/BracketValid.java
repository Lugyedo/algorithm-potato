package com.potato.leetcode.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author dehuab
 * LeetCode#20 有效括号
 */
public class BracketValid {
    public boolean isValid(String s) {
        if (s == null || s.length() <= 0) {
            return true;
        }

        Map<String, String> map = new HashMap<>();
        map.put(")", "(");
        map.put("}", "{");
        map.put("]", "[");

        Stack<String> stack = new Stack<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (map.keySet().contains(String.valueOf(c))) {
                if (stack.isEmpty()) {
                    return false;
                }

                String p = stack.pop();
                if (p == null || !p.equals(map.get(String.valueOf(c)))) {
                    return false;
                }
            } else {
                stack.push(String.valueOf(c));
            }
        }

        return stack.empty();
    }

    public boolean isValidByLength(String s) {
        if (s == null || s.length() <= 0) {
            return true;
        }

        int length;
        do {
            length = s.length();
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
        } while (length != s.length());

        return s.length() == 0;
    }
}
