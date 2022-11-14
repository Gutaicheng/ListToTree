package com.gutaicheng.Utils;

import lombok.Data;

/**
 * 前后端的数据协议
 * 笔记图里有
 * 对应 UsersController2
 */
@Data
public class R {
    private Boolean flag;
    private Object data;
    private String msg;

    public R(Boolean flag){
        this.flag = flag;
    }

    public R(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }

    public R(Boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }
}
