package com.yun.system.service.impl;

import com.yun.system.api.SystemValid;
import org.springframework.stereotype.Service;

/**
 * ClassName TokenValid
 * Description TODO
 * Author zhonghaigang
 * Date 2022/8/3 0:59
 * Version 1.0
 **/
@Service
public class TokenValid implements SystemValid {
    @Override
    public boolean valida(String str) {
        return false;
    }
}
