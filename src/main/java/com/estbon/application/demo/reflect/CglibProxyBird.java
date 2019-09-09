package com.estbon.application.demo.reflect;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author liushuaishuai
 * @date 2019/9/9 23:48
 * <p>
 * remark:
 */
public class CglibProxyBird implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("处理前");
        Object invoke = methodProxy.invokeSuper(o, objects);
        System.out.println("处理后");
        return invoke;
    }
}
