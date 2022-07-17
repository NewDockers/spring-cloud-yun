package com.yun.system.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yun.system.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SystemMapper extends BaseMapper<SysUser> {

}
