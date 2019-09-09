package com.estbon.application.demo.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author liushuaishuai
 * @date 2019/9/9 17:55
 */
public class DynamicProxyAnimal implements InvocationHandler {

    private Object proxied;

    public DynamicProxyAnimal(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理前");

        Object invoke = method.invoke(proxied, args);

        System.out.println("代理后");
        return invoke;
    }
}
