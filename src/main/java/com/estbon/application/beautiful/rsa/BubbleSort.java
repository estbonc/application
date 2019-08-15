package com.estbon.application.beautiful.rsa;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2019/3/5 16:43
 * @description 冒泡排序
 *
 * 冒泡排序是一种简单的排序算法。它重复地走访过要排序的数列，一次比较两个元素，如果它们的顺序错误就把它们交换过来。
 * 走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。
 * 这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端。
 *
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {167, 4, 7, 9, 89, 23};
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr2 = bubbleSort.bubble(arr);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }

    public int[] bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

}
