package com.yun.system.service.impl;

import com.yun.system.api.SystemValid;
import org.springframework.stereotype.Service;

/**
 * ClassName NameValid
 * Description TODO
 * Author zhonghaigang
 * Date 2022/8/3 1:01
 * Version 1.0
 **/
@Service
public class NameValid implements SystemValid {
    @Override
    public boolean valida(String str) {
        return false;
    }
}
