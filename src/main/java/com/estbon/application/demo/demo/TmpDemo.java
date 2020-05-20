package com.estbon.application.demo.demo;


import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author liushuaishuai
 * @date 2019/10/16 15:30
 */
public class TmpDemo {


    private static final int ARRAY_LENGTH = 2;


    public static void main(String[] args) {
        TmpDemo demo = new TmpDemo();

//
//        System.out.println(LocalTime.now());
//        System.out.println(LocalDate.now().getDayOfWeek().toString().equals("THURSDAY"));
//
//        System.out.println(LocalTime.now().getHour());
//        System.out.println(LocalTime.now().getMinute());
//        System.out.println(LocalTime.now().getSecond());

        System.out.println(demo.checkToUseCatch());
    }


    public boolean checkToUseCatch() {
        String weekDay = "THURSDAY";
        String timeStart = "18:50";
        String timeEnd = "20:00";
        if (!weekDay.equals(LocalDate.now().getDayOfWeek().toString())) {
            return false;
        }
        int nowHour = LocalTime.now().getHour();
        int nowMinute = LocalTime.now().getMinute();
        String[] startTimeArray = timeStart.split(":");
        String[] endTimeArray = timeEnd.split(":");
        if (startTimeArray.length != ARRAY_LENGTH || endTimeArray.length != ARRAY_LENGTH) {
            return false;
        }
        int hourStart = Integer.parseInt(startTimeArray[0]);
        int minuteStart = Integer.parseInt(startTimeArray[1]);
        int hourEnd = Integer.parseInt(endTimeArray[0]);
        int minuteEnd = Integer.parseInt(endTimeArray[1]);
        if (nowHour < hourStart || nowHour > hourEnd) {
            return false;
        }
        if (nowHour == hourStart) {
            if (nowMinute < minuteStart) {
                return false;
            }
        }
        if (nowHour == hourEnd) {
            return nowMinute <= minuteEnd;
        }
        return true;
    }

}
