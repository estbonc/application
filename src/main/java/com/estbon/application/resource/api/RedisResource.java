package com.estbon.application.resourse.api;

import com.estbon.application.redis.queue.RedisMessage;
import com.xiaoleilu.hutool.geo.Location;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Point;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liushuaishuai
 * @date 2019/11/29 15:37
 */
@Api(tags = "redis 测试")
@RestController
@RequestMapping("/redis")
public class RedisResource {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @GetMapping("/up")
    @ApiOperation("test")
    public void up() {
        Location location = new Location(1, 2);
        Map<Object, Point> memberCoordinateMap = new HashMap<>();
        memberCoordinateMap.put("shanghai", new Point(1, 2));
        Long add = redisTemplate.opsForGeo().add("123", memberCoordinateMap);
    }


    @GetMapping()
    public void put() {
        int i = 0;
        while (i < 5) {
            RedisMessage redisMessage = new RedisMessage(i, "this is test message : " + i);
            Long aLong = redisTemplate.opsForList().leftPush("list", redisMessage);
            System.out.println(aLong);
            i++;
        }
    }

    @GetMapping("/start")
    public void start() {
        while (true) {
            System.out.println("Waiting for a message in the queue");
            RedisMessage message = (RedisMessage) redisTemplate.opsForList().rightPop("list");
            System.out.println("Got the message");
            //Do some processing with the payload
            System.out.println("Message received:" + message);
            if (message == null) {
                return;
            }
        }
    }
}
