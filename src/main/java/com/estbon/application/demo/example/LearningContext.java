package com.estbon.application.demo.example;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author liushuaishuai
 * @date 2019/9/24 15:39
 */
@Data
@NoArgsConstructor
public class LearningContext {

    /**
     * 学生id.
     */
    public Long studentId;

    /**
     * 课程id.
     */
    public Long courseId;

    /**
     * 老师id.
     */
    protected Long teacherId;

    protected long unfinishedTotalTime;

    /**
     * 老师id.
     */
    protected List<Long> teacherIdList;

    /**
     * 是否查询指定老师大纲.
     */
    protected boolean multiTeacher;

    /**
     * 是否计算所有资源的完成状况.
     */
    protected boolean calculateAllResource;

    /**
     * 是否按阶段计算资源完成状况.
     */
    protected boolean calculateGradationResource;

    /**
     * 是否按章节计算资源完成状况.
     */
    protected boolean calculateStairResource;

    /**
     * 更新学情是否成功.
     */
    protected boolean updateStatus;

    /**
     * 是否持久化最新学情到数据库.
     */
    protected boolean persistence;

    /**
     * 是否通过学前测试
     */
    protected Boolean preGuideFinished;

    public LearningContext(Long studentId, Long courseId) {
        this.studentId = studentId;
        this.courseId = courseId;
    }
}
