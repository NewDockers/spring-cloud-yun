package com.yun.system.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;

/**
 * ClassName SysDepartment
 * Description TODO
 * Author zhonghaigang
 * Date 2022/7/21 23:13
 * Version 1.0
 **/
@TableName(value = "sys_department")


@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class SysDepartment {

    @TableId(type = IdType.AUTO)
    private Integer departId;

    private String departName;
    private Date createTime;
    private Date updateTime;

}
