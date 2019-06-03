package com.itheima.pojo;

import lombok.Data;

import java.util.List;
@Data
public class PageBean<T> {
    private long total;
    private List<T> rows;

    public PageBean(long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public PageBean() {

    }
}
