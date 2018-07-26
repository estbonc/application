package com.estbon.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: liushuaishuai
 * Email: liushuaishuai@91zdan.com
 * Date: 2017-10-27 23:41
 * Description:
 * History:
 */
@RestController
@RequestMapping("/love")
public class DruidController {

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String sayHello(){
        return "你好，我爱你（づ￣3￣）づ╭❤～";
    }




}
