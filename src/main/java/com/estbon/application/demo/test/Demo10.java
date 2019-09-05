package com.estbon.application.demo.test;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2018/4/28 19:37
 * @description BigDecimal类学习
 */
public class Demo10 {

    public static void main(String[] args) {


        BigDecimal bigDecimal = new BigDecimal(50.5358);

        System.out.println(bigDecimal);

        BigDecimal a1 = bigDecimal.setScale(2, RoundingMode.HALF_UP);

        BigDecimal a2 = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);

        System.out.println(a1);
        System.out.println(a2);


        BigDecimal b1 = new BigDecimal(15.012345);

        BigDecimal b2 = new BigDecimal(15.35677);
        BigDecimal b3 = new BigDecimal(15.35477);

        System.out.println(b1.setScale(0, BigDecimal.ROUND_UP));

        System.out.println(b2.setScale(2, RoundingMode.HALF_UP));

        System.out.println(b1.setScale(2, RoundingMode.HALF_UP));

        System.out.println(b1.setScale(2, RoundingMode.HALF_DOWN));

        System.out.println(b2.setScale(2, RoundingMode.HALF_DOWN));

        System.out.println(b3.setScale(2, RoundingMode.HALF_UP));
        System.out.println(b3.setScale(2, RoundingMode.HALF_DOWN));

    }
}
