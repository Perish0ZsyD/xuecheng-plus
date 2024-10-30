package com.xuecheng.base.model;

import lombok.Data;
import lombok.ToString;
import lombok.extern.java.Log;
/**
 * 由于分页查询这一类的接口在项目较多，这里针对分页查询的参数（当前页码、每页显示记录数）
 * @author Siyuan
 * @date 2024/10/30/21:00
 */
@Data
@ToString
public class PageParams {

    // 当前页码
    private Long pageNo = 1L;

    // 每页记录数默认值
    private Long pageSize = 10L;

    public PageParams() {

    }

    public PageParams(long pageNo, long pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }
}
