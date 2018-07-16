package com.mock.bean;

import jdk.nashorn.internal.ir.annotations.Ignore;

/**
 * @author :  peng.liu
 * @description : 测试忽略 属性 的bean
 * @date :    2018/7/16 10:13
 */
public class IgnoreBean {
    @Ignore
    private String ignore;
    private int notIgnore;

    public String getIgnore() {
        return ignore;
    }

    public void setIgnore(String ignore) {
        this.ignore = ignore;
    }

    public int getNotIgnore() {
        return notIgnore;
    }

    public void setNotIgnore(int notIgnore) {
        this.notIgnore = notIgnore;
    }
}
