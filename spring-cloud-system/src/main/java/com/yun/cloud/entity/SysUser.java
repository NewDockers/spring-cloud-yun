package com.yun.cloud.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * ClassName SysUser
 * Description TODO
 * Author zhonghaigang
 * Date 2022/6/24 18:06
 * Version 1.0
 **/
@Data
public class SysUser {
    private int id;
    private String username;
    private String pwd;
    private String id_card;
}
