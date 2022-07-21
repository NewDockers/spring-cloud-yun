package com.yun.system.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yun.system.entity.SysDepartment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * ClassName DepartMapper
 * Description TODO
 * Author zhonghaigang
 * Date 2022/7/21 23:23
 * Version 1.0
 **/
@Repository
@Mapper
public interface DepartMapper extends BaseMapper<SysDepartment> {
}
