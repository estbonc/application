package com.estbon.application.service;

import org.springframework.stereotype.Service;

/**
 * @author liushuaishuai
 * @date 2020/3/6 14:50
 */
@Service
public class IocServiceB {


    private String name;

    public IocServiceB() {
    }

    public IocServiceB(String name) {
        this.name = name;
    }

    public String getName() {
        return "I am B";
    }

    public String getNameFromParam() {
        return name;
    }

}
