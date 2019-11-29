package com.estbon.application.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @author liushuaishuai
 * @date 2019/7/30 11:51
 */
@Component
@Slf4j
public class CommandLineRunnerTest implements CommandLineRunner {

    @Autowired
    private RedisTemplate redisTemplate;


    @Override
    public void run(String... args) throws Exception {
//        while (true) {
//            System.out.println("Waiting for a message in the queue");
//            long messages = (long) redisTemplate.opsForList().rightPop("list");
//            System.out.println("Got the message");
//            System.out.println("KEY: list" + " VALUE:" + messages);
//            //Do some processing with the payload
//            System.out.println("Message received:" + messages);
//        }
    }
}
