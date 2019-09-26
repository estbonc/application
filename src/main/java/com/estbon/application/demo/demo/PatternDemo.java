package com.estbon.application.demo.demo;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author liushuaishuai
 * @date 2019/9/16 18:04
 */
public class PatternDemo {

    public static void main(String[] args) {

        System.out.println(isNumber("0123456789888"));

    }

    public static boolean isNumber(String param) {
        Pattern pattern = Pattern.compile("^[0-9]*$");
        Matcher matcher = pattern.matcher(param);
        return StringUtils.isNotBlank(param) && matcher.matches();
    }
}
