package com.estbon.application.demo;

public class Demo01 {

    public static void main(String[] args) {

        int x=fib(4);
        System.out.println(x);
        //求出连续20个斐波那契数列元素
        for(int i=1;i<20;i++){
            System.out.print(" "+fib(i));
        }
        //非递归算法
        int a=0;
        int b=1;
        int c;
        for(int i=0;i<8;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(" "+c);
        }
    }
    /**
     * 0　1　1　2　3　5　8
     * 求第n个斐波那契数列元素。
     * @param n
     * @return
     */
    public static int fib(int n){
        if(n==1)return 0;
        else if(n==2)return 1;
        else return fib(n-1)+fib(n-2);
    }


} 
