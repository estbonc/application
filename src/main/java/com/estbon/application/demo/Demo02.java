package com.estbon.application.demo;

public class Demo02 {

    public static void main(String[] args) {


    }

    /**
     * 查询给定数值X在数组中的位置
     * @param x    给定的数值
     * @param arr  给定的数组
     * @return
     */
    public int find(int x,int[] arr){
        //数组是有序的，遍历数组中元素的值，
        // 与X做比较如果相等则该元素下标+1即为在有序数组中第一次出现的位置
        for(int i = 0;i< arr.length ;i++){
            if(x == arr[i]){
                return  i + 1;
            }
        }
        return 0;
    }
}
