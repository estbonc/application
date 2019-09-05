package com.estbon.application.demo.demo;


/**
 * @author liushuaishuai
 * @date 2019/1/30 10:55
 */
public class Demo19 {

    public static void main(String[] args) {

        final int num = 1;
        Converter<Integer, String> s = (param) -> System.out.println(String.valueOf(param + num));
        s.convert(2);  // 输出结果为 3
    }

    public interface Converter<T1, T2> {
        void convert(int i);
    }


}
