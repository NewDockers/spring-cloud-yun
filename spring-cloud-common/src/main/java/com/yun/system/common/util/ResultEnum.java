package com.yun.system.common.util;

public enum ResultEnum {
    SUCCESS("200","请求成功"),
    FAIL("500","服务器异常");

    private String code;
    private String msg;

    ResultEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
