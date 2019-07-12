package com.estbon.application.resourse.api;

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
@RequestMapping("/")
public class DruidController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String sayHello() {
        return "Hello World";
    }


}
