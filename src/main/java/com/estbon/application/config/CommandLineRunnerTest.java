package com.estbon.application.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

/**
 * @author liushuaishuai
 * @date 2019/7/30 11:51
 */
@Component
@Slf4j
public class CommandLineRunnerTest implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        log.info("CommandLineRunnerTest  开始；");
        Stream.of(args).forEach(a -> {
            log.info(a);
        });

        log.info("CommandLineRunnerTest  结束；");
    }
}
