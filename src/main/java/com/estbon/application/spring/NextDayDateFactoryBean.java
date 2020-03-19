package com.estbon.application.spring;

import com.xiaoleilu.hutool.date.DateTime;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author liushuaishuai
 * @date 2020/3/8 11:17 下午
 */
@Component
public class NextDayDateFactoryBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return new DateTime();
    }

    @Override
    public Class getObjectType() {
        return DateTime.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
