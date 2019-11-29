package com.estbon.application.redis.queue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author liushuaishuai
 * @date 2019/11/29 15:42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RedisMessage implements Serializable {
    private static final long serialVersionUID = 7792729L;

    private int id;

    private String content;
}
