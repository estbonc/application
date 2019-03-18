package com.estbon.application.bean.enums;


/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2018/4/8 10:39
 * @description
 */

public enum FruitsEnum {

    APPLE(1,"apple"),ORANGE(2,"orange"),BANANA(3,"banana");

    private Integer type;
    private String name;

    FruitsEnum(Integer type, String name) {
        this.type = type;
        this.name = name;
    }

}
