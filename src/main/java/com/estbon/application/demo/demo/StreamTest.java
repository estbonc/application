package com.estbon.application.demo.demo;


import com.estbon.application.demo.example.Test;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2018/6/5 16:03
 * @description 枚举测试
 */
public class StreamTest {


    public static void main(String[] args) {
        List<Integer> b = Lists.newArrayList(1, 2, 3);

        List<Test> a = Lists.newArrayList();
        a.add(new Test(1, 4));
        a.add(new Test(1, 3));
        a.add(new Test(1, 2));
        a.add(new Test(2, 4));
        a.add(new Test(2, 444));
        a.add(new Test(2, 2));

        List<Test> result = Lists.newArrayList();

        //按paperId 分组
        Map<Integer, List<Test>> collect = a.stream().collect(Collectors.toMap(Test::getId, value -> Lists.newArrayList(value),
                (List<Test> oldValueList, List<Test> newValueList) -> {
                    oldValueList.addAll(newValueList);
                    return oldValueList;
                }
        ));
        for (Map.Entry<Integer, List<Test>> entry : collect.entrySet()) {
            Test t = new Test();
            t.setId(entry.getKey());
            int sum = entry.getValue().stream().mapToInt(Test::getCount).sum();

            t.setCount(sum);
            result.add(t);
        }

        System.out.println(result);

    }


}
