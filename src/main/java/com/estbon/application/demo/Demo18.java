package com.estbon.application.demo;


import java.text.SimpleDateFormat;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2018/9/11 14:16
 * @description
 */
public class Demo18 {


    public static void main(String[] args) {
        String time = "2019-12-11";
        boolean validDate = isValidDate(time);
        System.out.println(time);
        System.out.println(validDate);
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

}
