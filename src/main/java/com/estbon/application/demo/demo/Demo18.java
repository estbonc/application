package com.estbon.application.demo.demo;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2018/9/11 14:16
 * @description 日期时间格式化
 */
public class Demo18 {


    public static void main(String[] args) {
        String time = "2019-12-11";
        boolean validDate = isValidDate(time);
        System.out.println(time);
        System.out.println(validDate);

        Date date = addDays(new Date(), -1);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String format1 = format.format(date);
        System.out.println(format1);

        try {
            Date parse = format.parse(format1);

            System.out.println(date.getTime());

            System.out.println(parse.getTime());

        } catch (ParseException e) {
            e.printStackTrace();
        }




    }


    public static boolean isValidDate(String str) {
        boolean convertSuccess = true;
        // 指定日期格式为四位年/两位月份/两位日期，注意yyyy/MM/dd区分大小写；
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            // 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
            format.parse(str);
        } catch (Exception e) {
            // e.printStackTrace();
            // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
            convertSuccess = false;
        }
        return convertSuccess;
    }

    /**
     * 计算日期加减
     *
     * @param inDate  初始日期
     * @param addDate 要加的日期
     * @param field   要加的域
     * @return 结果日期
     */
    private static Date addDates(final Date inDate, final int addDate, final int field) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(inDate);
        calendar.add(field, addDate);
        return calendar.getTime();
    }

    /**
     * 日期加减天数
     *
     * @param inDate 初始日期
     * @param addDay 要加的天数(负值代表减)
     * @return 结果日期
     */
    public static Date addDays(final Date inDate, final int addDay) {
        return addDates(inDate, addDay, Calendar.DAY_OF_MONTH);
    }


}
