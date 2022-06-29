package com.yun.cloud.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yun.cloud.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SystemMapper extends BaseMapper<SysUser> {

}
