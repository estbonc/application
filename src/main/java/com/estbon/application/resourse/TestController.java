package com.estbon.application.resourse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2018/4/3 20:19
 * @description
 */
@RestController
public class TestController {

    @RequestMapping("")
    String home(){
        return "hello,你好";
    }

}

