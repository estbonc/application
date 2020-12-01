package com.estbon.application.beautiful.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liushuaishuai
 * @date 2020/11/27 13:48
 */
public class Solution454 {


    public static void main(String[] args) {
        int[] A = {1, 2};
        int[] B = {-2, -1};
        int[] C = {-1, 2};
        int[] D = {0, 2};

        Solution454 solution454 = new Solution454();
        solution454.fourSumCount(A,B,C,D);


    }

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : A) {
            for (int b : B) {
                map.put(a + b, map.getOrDefault(a + b, 0) + 1);
            }
        }
        for (int c : C) {
            for (int d : D) {
                res += map.getOrDefault(-(c + d), 0);
            }
        }
        return res;
    }


}
