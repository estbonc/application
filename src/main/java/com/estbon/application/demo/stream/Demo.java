package com.estbon.application.demo.stream;

import lombok.Data;

/**
 * @author liushuaishuai
 * @date 2019/9/6 9:42
 */
@Data
public class Demo {

    private String name;

    private Integer sex;

    private String age;

    public Demo(String age, Integer sex) {
        this.age = age;
        this.sex = sex;
    }
}
