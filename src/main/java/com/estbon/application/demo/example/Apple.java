package com.estbon.application.demo.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2018/5/8 18:22
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Apple {

    private Integer weight;

    private String color;



    private void getYellow(){
        System.out.println("1111");
    }





}
