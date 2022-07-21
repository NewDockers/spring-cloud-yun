package com.yun.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yun.system.Mapper.SystemMapper;
import com.yun.system.entity.SysUser;
import com.yun.system.service.SystemService;
import com.yun.system.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ClassName SystemServiceImpl
 * Description TODO
 * Author zhonghaigang
 * Date 2022/6/24 18:12
 * Version 1.0
 **/
@Service
public class SystemServiceImpl extends ServiceImpl<SystemMapper, SysUser> implements SystemService {
    @Autowired
    private SystemMapper systemMapper;

    @Override
    public SysUser getToken(HttpServletRequest request, HttpServletResponse response) {
        QueryWrapper<SysUser> userQueryWrapper = new QueryWrapper<>();

        userQueryWrapper.eq("username","小李");
        SysUser sysUser = systemMapper.selectOne(userQueryWrapper);

        return sysUser;
    }
}
