package com.estbon.application.beautiful.leetcode;

/**
 * @author liushuaishuai
 * @date 2020/11/9 16:33
 */
public class Solution28 {


    public static void main(String[] args) {
        String haystack = "";
        String needle = "";

        System.out.println(strStr(haystack,needle));
    }


    public static int strStr(String haystack, String needle) {

        if (haystack.length() == 0 && needle.length() == 0) {
            return 0;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        int length = needle.length();
        for (int i = 0; i <= haystack.length() - length; i++) {
            String substring = haystack.substring(i, length + i);
            if (substring.equals(needle)) {
                return i;
            }
        }
        return -1;
    }

}
