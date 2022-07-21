package com.yun.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yun.system.Mapper.DepartMapper;
import com.yun.system.entity.SysDepartment;
import com.yun.system.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * ClassName DepartServiceImpl
 * Description TODO
 * Author zhonghaigang
 * Date 2022/7/21 23:26
 * Version 1.0
 **/
@Service
public class DepartServiceImpl extends ServiceImpl<DepartMapper, SysDepartment> implements DepartService {
    @Autowired
    private DepartMapper departMapper;

    @Override
    public Optional<SysDepartment> listOne() {
        return Optional.empty();
    }

    @Override
    public List<SysDepartment> listAll() {
        QueryWrapper<SysDepartment> queryWrapper = new QueryWrapper<>();
        return departMapper.selectList(queryWrapper);
    }
}
