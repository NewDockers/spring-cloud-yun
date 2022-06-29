package com.yun.cloud;

import com.yun.cloud.common.util.Constant;

/**
 * ClassName Result
 * Description TODO
 * Author zhonghaigang
 * Date 2022/6/24 22:01
 * Version 1.0
 **/
public class Result<T> {
    private String code;
    private String msg;
    private T data;

    public Result(){

    }
    public Result(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
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


    public static <T> Result<?> buildSuccess(T data){
        return new Result<>(Constant.SUCCESS,"",data);
    }
}
