package com.estbon.application.demo.demo;

import org.springframework.context.ApplicationListener;
import org.springframework.core.io.support.SpringFactoriesLoader;

import java.io.IOException;
import java.util.List;

/**
 * @author liushuaishuai
 * @date 2019/9/3 11:23
 */
public class SpringFactoriesLoaderTest {


    public static void main(String[] args) throws IOException {
        List<ApplicationListener> loadFactories = SpringFactoriesLoader.loadFactories(ApplicationListener.class, null);
        System.out.println(loadFactories.size());
    }

}
