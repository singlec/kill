package com.imooc.kill.VO;

import lombok.Data;

/**
 * Create By 一条狗
 * 2018/5/12 16:27
 */
@Data
public class ResultVO<T> {
    private Integer code;
    private String msg;
    private T data;
}
