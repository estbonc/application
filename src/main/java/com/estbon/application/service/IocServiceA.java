package com.estbon.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liushuaishuai
 * @date 2020/3/6 14:50
 */
@Service
public class IocServiceA {

    @Autowired
    private IocServiceB serviceB;


    public String getName() {
        return "I am A";
    }

    public String getBName() {
        return serviceB.getName();
    }

}
