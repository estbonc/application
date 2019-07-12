package com.estbon.application.demo.demo;


import com.estbon.application.bean.enums.QuoteRoomEnum;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2018/6/5 16:03
 * @description 枚举测试
 */
public class Demo11 {


    public static void main(String[] args) {
        Long a = 0l;
        System.out.println(a.equals(0l));
        QuoteRoomEnum all = Enum.valueOf(QuoteRoomEnum.class, "ALL");
        System.out.println(all);

    }
}
