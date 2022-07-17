package com.yun.system.common.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * ClassName RequestParamMap
 * Description TODO
 * Author zhonghaigang
 * Date 2022/7/4 22:04
 * Version 1.0
 **/

public class RequestParamMap {
    private String key;
    private String value;

    public RequestParamMap(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"张三");
        map.put(2,"李四");
        map.put(3,"溜溜");

        //entrySet
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, String> next = iterator.next();
            System.out.println(next.getKey());
            System.out.println(next.getValue());
        }

        //KeySet

        Iterator<Integer> iterator1 = map.keySet().iterator();
        while(iterator1.hasNext()){
            Integer key = iterator1.next();
            System.out.println(key);
            System.out.println(map.get(key));
        }

    }
}
