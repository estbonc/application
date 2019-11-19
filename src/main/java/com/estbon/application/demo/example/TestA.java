package com.estbon.application.demo.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author liushuaishuai
 * @date 2019/11/18 16:12
 */
@Component
public class TestA {

    protected LearningContext context;

    @Autowired
    public TestC helper;

    /**
     * 初始化context
     *
     * @param studentId 学生id
     * @param courseId  课程id
     * @return .
     */
    public TestA initContext(Long studentId, Long courseId) {
        this.context = new LearningContext(studentId, courseId);
        return this;
    }

    /**
     * 激活计算课程整体完成情况
     *
     * @return .
     */
    public TestA enableCalculateAllResource() {
        context.setCalculateAllResource(true);
        return this;
    }

    /**
     * 激活按阶段计算完成情况
     *
     * @return .
     */
    public TestA enableCalculateGradationResource() {
        context.setCalculateGradationResource(true);
        return this;
    }

    /**
     * 激活按章节计算完成情况
     *
     * @return .
     */
    public TestA enableCalculateStairResource() {
        context.setCalculateStairResource(true);
        return this;
    }

    /**
     * 激活更新学情到mysql
     *
     * @return .
     */
    public TestA enablePersistence() {
        context.setPersistence(true);
        return this;
    }

    /**
     * 传入老师列表
     *
     * @param teacherList .
     * @return .
     */
    public TestA buildTeacherList(List<Long> teacherList) {
        context.setTeacherIdList(teacherList);
        return this;
    }


    public LearningContext build() {
        helper.getSSS();

        System.out.println("testA build method");
        return context;
    }

}
