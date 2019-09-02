package com.estbon.application.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author liushuaishuai
 * @date 2019/8/27 15:49
 */
@Slf4j
@Component
public class ScheduledService {

    @Scheduled(cron = "0 59 17 * * ?")
    public void scheduled() {
        log.info("=====>>>>>使用cron  {}", System.currentTimeMillis());
        log.info("当前时间：{}", new Date());
    }

    @Scheduled(cron = "0 0 0/1 * * *")
    public void scheduled2() {
        log.info("当前时间:{}", new Date());
    }

}
