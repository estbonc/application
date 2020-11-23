package com.estbon.application.demo.stream;

import lombok.Data;

/**
 * @author liushuaishuai
 * @date 2019/9/6 9:42
 */
@Data
public class PeopleDemo {

    private String name;

    private Integer sex;

    private String age;

    public PeopleDemo(String age, Integer sex) {
        this.age = age;
        this.sex = sex;
    }
}
