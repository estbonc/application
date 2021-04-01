package com.estbon.application.test;


import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;

import java.util.Calendar;
import java.util.Date;

/**
 * @author liushuaishuai
 * @date 2021/4/1 16:51
 */
public class TestA {

    public static void main(String[] args) {


        System.out.println(DateUtil.beginOfDay(new Date()).getTime() / 1000);
        System.out.println(DateUtil.endOfDay(new Date()).getTime() / 1000);

        Date thisWeekMonday = getThisWeekMonday(new Date());
        System.out.println(DateUtil.format(thisWeekMonday, DatePattern.NORM_DATE_PATTERN));
        System.out.println(DateUtil.format(getNextWeekMonday(new Date()), DatePattern.NORM_DATE_PATTERN));

        Date date = new Date();
        System.out.println(DateUtil.beginOfWeek(date).getTime() / 1000);
        System.out.println(DateUtil.endOfWeek(date).getTime() / 1000);

    }

    /**
     * 本周一
     *
     * @param date .
     * @return .
     */
    public static Date getThisWeekMonday(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        // 获得当前日期是一个星期的第几天
        int dayWeek = cal.get(Calendar.DAY_OF_WEEK);
        if (1 == dayWeek) {
            cal.add(Calendar.DAY_OF_MONTH, -1);
        }
        // 设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一
        cal.setFirstDayOfWeek(Calendar.MONDAY);
        // 获得当前日期是一个星期的第几天
        int day = cal.get(Calendar.DAY_OF_WEEK);
        // 根据日历的规则，给当前日期减去星期几与一个星期第一天的差值
        cal.add(Calendar.DATE, cal.getFirstDayOfWeek() - day);
        return cal.getTime();
    }

    /**
     * 获取下周一时间
     *
     * @param date .
     * @return .
     */
    public static Date getNextWeekMonday(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(getThisWeekMonday(date));
        cal.add(Calendar.DATE, 7);
        return cal.getTime();
    }
}
