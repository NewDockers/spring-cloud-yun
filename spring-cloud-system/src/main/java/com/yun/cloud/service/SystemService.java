package com.yun.cloud.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yun.cloud.entity.SysUser;
import com.yun.cloud.util.Result;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ClassName SystemService
 * Description TODO
 * Author zhonghaigang
 * Date 2022/6/24 18:00
 * Version 1.0
 **/
public interface SystemService extends IService<SysUser> {
    Result<?> getToken(HttpServletRequest request, HttpServletResponse response);
}
