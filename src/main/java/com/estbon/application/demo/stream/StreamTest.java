package com.estbon.application.demo.stream;


import com.estbon.application.demo.bean.StreamTestBean;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2018/6/5 16:03
 * @description
 */
public class StreamTest {


    public static void main(String[] args) {
        List<Integer> b = Lists.newArrayList(1, 2, 3);

        List<StreamTestBean> a = Lists.newArrayList();
        a.add(new StreamTestBean(1, 4));
        a.add(new StreamTestBean(1, 3));
        a.add(new StreamTestBean(1, 2));
        a.add(new StreamTestBean(2, 4));
        a.add(new StreamTestBean(2, 444));
        a.add(new StreamTestBean(2, 2));

        List<StreamTestBean> result = Lists.newArrayList();

        //按paperId 分组
        Map<Integer, List<StreamTestBean>> collect = a.stream().collect(Collectors.toMap(StreamTestBean::getId, value -> Lists.newArrayList(value),
                (List<StreamTestBean> oldValueList, List<StreamTestBean> newValueList) -> {
                    oldValueList.addAll(newValueList);
                    return oldValueList;
                }
        ));
        for (Map.Entry<Integer, List<StreamTestBean>> entry : collect.entrySet()) {
            StreamTestBean t = new StreamTestBean();
            t.setId(entry.getKey());
            int sum = entry.getValue().stream().mapToInt(StreamTestBean::getCount).sum();

            t.setCount(sum);
            result.add(t);
        }

        System.out.println(result);

    }


}
