package com.estbon.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author lss
 */
@SpringBootApplication
@EnableScheduling
public class LssApplication {
    public static void main(String[] args) {
        SpringApplication.run(LssApplication.class, args);
//        new SpringApplicationBuilder()
//                .sources(Parent.class)
//                .child(Application.class)
//                .bannerMode(Banner.Mode.OFF)
//                .run(args);
    }
}
