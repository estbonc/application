package com.estbon.application.resource.api;

import com.estbon.application.service.IocServiceB;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liushuaishuai
 * @date 2020/3/6 14:51
 */
@RestController
public class TestController {


    @GetMapping("/name")
    public String getName() {
        IocServiceB serviceB = new IocServiceB("hello world");
        return serviceB.getNameFromParam();
    }


}
