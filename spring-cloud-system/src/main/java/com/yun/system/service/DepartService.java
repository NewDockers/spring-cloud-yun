package com.yun.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yun.system.entity.SysDepartment;

import java.util.List;
import java.util.Optional;

public interface DepartService extends IService<SysDepartment> {

    Optional<SysDepartment> listOne();

    List<SysDepartment> listAll();
}
