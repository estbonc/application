package com.estbon.application.beautiful.leetcode;


/**
 * @author liushuaishuai
 * @date 2019/9/27 9:16
 */
public class LeetCode3 {

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("auauubcd"));

    }


    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int[] tmp = new int[256];
        int maxlen = 0;
        int l = 0;
        int r = 0;

        while (l < s.length()) {
            if (r < s.length() && tmp[s.charAt(r)] == 0) {
                tmp[s.charAt(r++)] = 1;
            } else {
                maxlen = maxlen > (r - l) ? maxlen : (r - l);

                tmp[s.charAt(l++)] = 0;

            }
        }

        return maxlen;
    }
}
