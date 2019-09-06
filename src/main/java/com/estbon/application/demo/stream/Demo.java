package com.estbon.application.demo.stream;

/**
 * @author liushuaishuai
 * @date 2019/9/6 9:42
 */
class Demo {
    private String name;
    private Integer sex;
    private String age;

    public Demo(String age, Integer sex) {
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

}
