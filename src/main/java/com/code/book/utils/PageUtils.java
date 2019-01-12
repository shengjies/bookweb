package com.code.book.utils;

public class PageUtils {
    private long count;
    private Object data;

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public PageUtils() {
    }

    public PageUtils(long count, Object data) {
        this.count = count;
        this.data = data;
    }
}
