package com.yun.system.util;

/**
 * ClassName Result
 * Description TODO
 * Author zhonghaigang
 * Date 2022/6/24 17:47
 * Version 1.0
 **/
public class Result<T> {
    private String code;
    private String msg;
    private T data;

    public Result(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> Result<?> ok(T data){
        return new Result<>("200",null,data);
    }
}
