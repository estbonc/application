package com.estbon.application.rsa;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2019/3/5 18:22
 * @description
 * 选择排序(Selection-sort)是一种简单直观的排序算法。
 * 它的工作原理：首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，
 * 然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
 */
public class SelectionSort {



    public static void main(String[] args) {
        int[] arr = {167, 4, 7, 9, 89, 23};
        SelectionSort selectionSort = new SelectionSort();
        int[] arr2 = selectionSort.selection(arr);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }



    public int[] selection(int[] arr){

        int len = arr.length;
        int minIndex, temp;
        for (int i = 0; i < len - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[minIndex]) {     // 寻找最小的数
                    minIndex = j;                 // 将最小数的索引保存
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;

    }
}
