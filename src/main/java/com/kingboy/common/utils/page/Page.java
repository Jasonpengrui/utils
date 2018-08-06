package com.kingboy.common.utils.page;


import com.kingboy.common.utils.mapper.MapperUtils;

import java.util.List;
import java.util.Objects;

/**
 * 分页容器.
 * @author KingBoy - KingBoyWorld@163.com
 * @since 2018-08-07
 */
public class Page {

    //当前页
    private Integer current = 1;

    //每页容量
    private Integer size = 10;

    //总条数
    private Long total;

    //分页数据
    private List data;

    public Page() {}

    public Page(Integer current, Integer size) {
        this.current = current;
        this.size = size;
    }

    /**
     * .
     * @param <T> 实体类型
     * @author KingBoy - KingBoyWorld@163.com
     * @since 2018/8/7 02:21
     */
    public <T> Page(Integer current, Integer size, Long total, List<T> data) {
        this.current = current;
        this.size = size;
        this.total = total;
        this.data = data;
    }

    /**
     * .
     * @param clazz 要转换的类型
     * @author KingBoy - KingBoyWorld@163.com
     * @since 2018/8/7 02:21
     */
    public <E> void convert(Class<E> clazz) {
        this.data = MapperUtils.mapperList(data, clazz);
    }

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        if (Objects.nonNull(current)) {
            this.current = current;
        }
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        if (Objects.nonNull(size)) {
            this.size = size;
        }
    }

    public Long getTotal() {
        return total;
    }

    public List getData() {
        return data;
    }

}