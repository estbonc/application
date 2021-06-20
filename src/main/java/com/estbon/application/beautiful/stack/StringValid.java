package com.estbon.application.beautiful.stack;

import java.util.Stack;

/**
 * @author liushuaishuai
 * @date 2021/6/13 23:26
 */
public class StringValid {

    public static void main(String[] args) {
        String test = "()()(())()())";
        System.out.println(isValid(test));
    }


    public static boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if ('(' == s.charAt(i)) {
                stack.push(s.charAt(i));
            } else if (')' == s.charAt(i)) {
                if (stack.empty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
