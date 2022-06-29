package com.yun.cloud.controller;

import com.yun.cloud.service.SystemService;
import com.yun.cloud.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName SystemController
 * Description TODO
 * Author zhonghaigang
 * Date 2022/6/24 17:42
 * Version 1.0
 **/
@RestController
public class SystemController {

    @Autowired
    private SystemService systemService;
    @RequestMapping("/login")
    public String login(){
        return "hello nacos";
    }

    @RequestMapping("/token")
    public Result<?> token(){
        Map<String,Object> map = new HashMap<>();
        map.put("zhangsan","123456");
        map.put("zhangsan2","123456");
        map.put("zhangsan3","123456");
        return Result.ok(map);
    }

    @RequestMapping("/getToken")
    public Result<?> getToken(HttpServletRequest request, HttpServletResponse response){
        Result<?> token = systemService.getToken(request, response);

        return token;
    }
}
