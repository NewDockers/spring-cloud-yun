package com.yun.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * ClassName SysUser
 * Description TODO
 * Author zhonghaigang
 * Date 2022/6/24 18:06
 * Version 1.0
 **/
@Data
@SuperBuilder
@TableName(value = "sys_user")
@NoArgsConstructor
@AllArgsConstructor
public class SysUser {
    @TableId(type = IdType.AUTO)
    private Integer id;


    private String username;
    private String pwd;

    private String idcard;
}
