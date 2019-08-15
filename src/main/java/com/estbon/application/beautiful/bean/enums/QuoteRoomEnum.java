package com.estbon.application.beautiful.bean.enums;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2018/6/7 14:08
 * @description
 */
public enum QuoteRoomEnum {

    ALL("all") {
        @Override
        public List<Integer> getRoomList() {
            return Lists.newArrayList();
        }
    };




    private String name;

    public abstract List<Integer> getRoomList();

    QuoteRoomEnum(String name){
        this.name = name;
    }
}
