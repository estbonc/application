package com.estbon.application.beautiful.leetcode;

import com.google.common.collect.Maps;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author liushuaishuai
 * @date 2019/9/27 13:04
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 */
public class LeetCode20 {


    public static void main(String[] args) {
        String ss = "()[()()()()()({}{}{}{}{})]{}";

        boolean valid = isValid(ss);
        System.out.println(valid);


    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        if (s == null || s.length() < 1) {
            return false;
        }
        HashMap<Character, Character> map = Maps.newHashMap();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        if (s.length() % 2 != 0) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                stack.push(s.charAt(i));
            } else {
                char top = stack.empty() ? '#' : stack.pop();
                if(map.get(top) != c){
                    return false;
                }
            }
        }
        return stack.empty();
    }


}
