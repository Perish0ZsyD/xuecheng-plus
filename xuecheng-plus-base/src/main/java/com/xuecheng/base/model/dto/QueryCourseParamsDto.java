package com.xuecheng.base.model.dto;

import lombok.Data;
import lombok.ToString;

/**
 * @description: 课程查询参数Dto
 * @author Siyuan
 * @date 2024/10/30/21:08
 * @version 1.0
 */
@Data
@ToString

public class QueryCourseParamsDto {

    // 审核状态
    private String auditStatus;

    // 课程名称
    private String courseName;

    // 发布状态
    private String publishStatus;
}
