package com.xuecheng.base.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @description: 分页查询结果封装类
 * @author Siyuan
 * @date 2024/10/30/21:09
 */
@Data
@ToString
public class PageResult<T> implements Serializable {
    // 数据列表,此模型类中定义了List属性，此属性存放数据列表，且支持泛型，课程查询接口的返回类型可以是此模型类型
    private List<T> items;

    // 总记录数
    private long counts;

    // 当前页码
    private long page;

    // 每页记录数
    private long pageSize;

    public PageResult(List<T> items, long counts, long page, long pageSize) {
        this.items = items;
        this.counts = counts;
        this.page = page;
        this.pageSize = pageSize;
    }
}
