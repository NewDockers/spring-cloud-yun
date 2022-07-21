package com.yun.system.common.util;

/**
 * ClassName Mayitk
 * Description TODO
 * Author zhonghaigang
 * Date 2022/7/17 20:29
 * Version 1.0
 **/
public class Mayitk {
    private Integer id;
    private String userName;
    private String passWord;

    public Mayitk() {

    }

    public Mayitk(Integer id, String userName, String passWord) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "Mayitk{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
