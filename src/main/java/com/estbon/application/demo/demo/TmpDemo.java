package com.estbon.application.demo.demo;


/**
 * @author liushuaishuai
 * @date 2019/10/16 15:30
 */
public class TmpDemo {


    public static void main(String[] args) {
        String format = String.format("%s%04d", "1014", 1234);

        System.out.println(format);
        System.out.println(Long.parseLong(format));


        String adc = "你好123ads你好你好你好你好你好";

        CharSequence charSequence = adc.subSequence(0, 10);
        String substring = adc.substring( 10);
        System.out.println(charSequence);
        System.out.println(substring);
    }


}
