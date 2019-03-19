package com.estbon.application.demo;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2018/8/13 11:08
 * @description
 */
public class Demo15 {


    public static void main(String[] args) {

        BigDecimal b1 = new BigDecimal(15.012345);

        BigDecimal b2 = new BigDecimal(15.35677);
        BigDecimal b3 = new BigDecimal(15.35477);

        System.out.println(b1.setScale(0,BigDecimal.ROUND_UP));

        System.out.println(b2.setScale(2,RoundingMode.HALF_UP));

        System.out.println(b1.setScale(2,RoundingMode.HALF_UP));

        System.out.println(b1.setScale(2,RoundingMode.HALF_DOWN));

        System.out.println(b2.setScale(2,RoundingMode.HALF_DOWN));

        System.out.println(b3.setScale(2,RoundingMode.HALF_UP));
        System.out.println(b3.setScale(2,RoundingMode.HALF_DOWN));
    }



}
