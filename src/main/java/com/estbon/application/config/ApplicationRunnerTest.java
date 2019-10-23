package com.estbon.application.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

/**
 * @author liushuaishuai
 * @date 2019/7/30 11:50
 */
@Component
@Slf4j
public class ApplicationRunnerTest implements ApplicationRunner , Ordered {
    @Override
    public void run(ApplicationArguments args) throws Exception {

        log.info("ApplicationRunnerTest  开始；");
        args.getOptionNames().stream().forEach(a -> {
            log.info(a);
        });
        args.getNonOptionArgs().stream().forEach(a -> {
            log.info(a);
        });
        Stream.of(args.getSourceArgs()).forEach(a -> {
            log.info(a);
        });
        log.info("ApplicationRunnerTest  结束；");
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
