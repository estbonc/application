package com.estbon.application.demo;

public class Demo00 {

    public static void main(String[] args) {
        int arrLength = 12;
        int[] arr = new int[arrLength];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        int count = 12;//arrLength 圈中剩余人数
        int n = 0;//报数器
        int index = 0;//报数位置
        while (count > 0) {
            if (arr[index] != 0) {
                n++;
                if (n == 7) {
                    System.out.println(arr[index]); //打印出要走出圈中人的编号
                    n = 0; //报数设置，下次再从1开始
                    arr[index] = 0;//将走出圈中人的编号设为0
                    count--;//总人数减少1人
                }
            }
            index++;
            if (index == 12) {
                index = index % 12;
            }
        }
    }
}
