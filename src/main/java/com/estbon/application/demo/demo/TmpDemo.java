package com.estbon.application.demo.demo;

import org.springframework.core.SpringVersion;

/**
 * @author liushuaishuai
 * @date 2019/10/16 15:30
 */
public class TmpDemo {


    public static void main(String[] args) {
        Package aPackage = TmpDemo.class.getPackage();

        System.out.println(SpringVersion.getVersion());
        System.out.println(aPackage.getImplementationVersion());

    }


}
