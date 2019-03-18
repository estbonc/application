package com.estbon.application.util;

import com.estbon.application.bean.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2018/4/3 20:15
 * @description
 */
public class TestUtils {

    @Autowired
    private User user;


    public String getName(){
        return user.getName();
    }


}
