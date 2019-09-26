package com.estbon.application.beautiful.leetcode;


/**
 * @author liushuaishuai
 * @date 2019/9/26 10:47
 */
public class LeetCode14 {


    public static void main(String[] args) {
        String[] strs1 = {"", "b"};
        String[] strs = {"flower", "flow", "flight"};

        System.out.println(longestCommonPrefix(strs));
        System.out.println(longestCommonPrefix1(strs));
    }


    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int length = -1;
        for (int i = 0; i < strs.length; i++) {
            if (length == -1 || strs[i].length() < length) {
                length = strs[i].length();
            }
        }
        String response = "";
        if (length == 0) {
            return response;
        }
        for (int i = 0; i < length; i++) {
            String tmp = "";
            for (int j = 0; j < strs.length; j++) {
                String substring = strs[j].substring(0, i + 1);
                if (tmp.equals("")) {
                    tmp = substring;
                }
                if (!tmp.equals(substring)) {
                    return response;
                }
            }
            response = tmp;
        }
        return response;
    }


    public static String longestCommonPrefix1(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String min = strs[0];
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].isEmpty()) {
                return "";
            }
            if (strs[0].charAt(0) != strs[i].charAt(0)) {
                return "";
            }
            if (strs[i].length() <= min.length()) {
                min = strs[i];
            }
        }
        for (int i = 0; i < strs.length; i++) {
            if (min.equals(strs[i])) {
                continue;
            }
            for (int j = min.length() - 1; j > 0; j--) {
                if (min.charAt(j) != strs[i].charAt(j)) {
                    min = min.substring(0, j);
                }
            }
        }
        return min;
    }


}
