package com.yun.system.controller;

import com.yun.system.entity.SysDepartment;
import com.yun.system.service.DepartService;
import com.yun.system.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName DeptController
 * Description TODO
 * Author zhonghaigang
 * Date 2022/7/21 23:22
 * Version 1.0
 **/
@RestController
@RequestMapping("/api/department")
public class DeptController {

    @Autowired
    private DepartService departService;

    @RequestMapping("/list")
    public Result listAll(){
        List<SysDepartment> sysDepartments = departService.listAll();
        return Result.ok(sysDepartments);
    }
}
