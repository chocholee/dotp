package com.dotp.core.commons.entity.vo.user;

import com.dotp.core.commons.entity.AbstractVO;

import java.util.Date;

/**
 * Created by sherw on 2016/6/6.
 */
public class UserInfo extends AbstractVO {

    private String  nickname;           // 昵称

    private SexEnum sex;                // 姓别

    private Date    birthday;           // 生日

    private String  description;        // 描述

    public UserInfo() {
        super();
    }

    public UserInfo(String nickname, SexEnum sex, Date birthday, String description) {
        this();
        this.nickname = nickname;
        this.sex = sex;
        this.birthday = birthday;
        this.description = description;
    }

    public String getNickname() {
        return nickname;
    }

    public SexEnum getSex() {
        return sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getDescription() {
        return description;
    }

}
