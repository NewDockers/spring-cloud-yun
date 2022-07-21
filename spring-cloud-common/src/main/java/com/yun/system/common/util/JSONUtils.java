package com.yun.system.common.util;

import com.alibaba.fastjson.JSONObject;

/**
 * ClassName JSONUtils
 * Description TODO fastjson使用
 * Author zhonghaigang
 * Date 2022/7/17 20:27
 * Version 1.0
 **/
public class JSONUtils {

    public static void JSONToObject(){

    }

    public static void ObjectToJSON(){
        Mayitk mayitk = new Mayitk(1,"OD","123456");
        String jsonString = JSONObject.toJSONString(mayitk);
        System.out.println(jsonString);
    }

    public static void main(String[] args) {
        Mayitk mayitk = new Mayitk(1,"OD","123456");
        String jsonString = JSONObject.toJSONString(mayitk);
        JSONObject parseObject = JSONObject.parseObject(jsonString);
        String userName = parseObject.getString("userName");
        System.out.println("userName:"+userName);

        System.out.println(jsonString);
    }
}
