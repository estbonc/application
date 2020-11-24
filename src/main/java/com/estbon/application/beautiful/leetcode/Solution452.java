package com.estbon.application.beautiful.leetcode;

import java.util.Arrays;

/**
 * @author liushuaishuai
 * @date 2020/11/23 18:11
 */
public class Solution452 {

    public static void main(String[] args) {
        int[][] arr = {{3, 9}, {7, 12}, {3, 8}, {6, 8}, {9, 10}, {2, 9}, {0, 9}, {3, 9}, {0, 6}, {2, 8}};

        Solution452 example = new Solution452();

        System.out.println(example.findMinArrowShots2(arr));

    }

    public int findMinArrowShots2(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        System.out.println(Arrays.deepToString(points));
        Arrays.sort(points, (point1, point2) -> {
            if (point1[1] > point2[1]) {
                return 1;
            } else if (point1[1] < point2[1]) {
                return -1;
            } else {
                return 0;
            }
        });
        System.out.println(Arrays.deepToString(points));
        int pos = points[0][1];
        int ans = 1;
        for (int[] balloon: points) {
            if (balloon[0] > pos) {
                pos = balloon[1];
                ++ans;
            }
        }
        return ans;
    }




    public int findMinArrowShots(int[][] points) {

        //排序
        Arrays.sort(points, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            } else {
                return a[0] - b[0];
            }
        });

        int[][] ints = new int[points.length][];
        for (int[] a : points) {
            for (int j = 0; j < ints.length; j++) {
                if (ints[j] == null) {
                    ints[j] = a;
                    break;
                }
                int[] b = ints[j];
                if (a[1] < b[0] || a[0] > b[1]) {
                    continue;
                }
                if (a[0] >= b[0]) {
                    b[0] = a[0];
                }
                if (a[1] <= b[1]) {
                    b[1] = a[1];
                }
                break;
            }
        }
        int response = 0;
        for (int[] a : ints) {
            if (a != null) {
                response++;
            }
        }
        return response;
    }

}
