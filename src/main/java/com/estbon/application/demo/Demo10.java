package com.estbon.application.demo;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2018/4/28 19:37
 * @description
 */
public class Demo10 {

    public static void main(String[] args) {


        BigDecimal bigDecimal = new BigDecimal(50.5348);

        System.out.println(bigDecimal);

        BigDecimal bigDecimal1 = bigDecimal.setScale(2, RoundingMode.HALF_UP);

        System.out.println(bigDecimal1);


    }
}
