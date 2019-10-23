package com.estbon.application.demo.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liushuaishuai
 * @date 2018/3/19 12:37
 * <p>
 * <p>
 * String类测试
 */
public class Demo04 {

    public static void main(String[] args) {


    }

    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//            SomeBean someBean= (SomeBean) context.getBean("someBean");
//            someBean.doSomething();
    }


}
