package com.dotp.core.facade.event.user;

/**
 * Created by sherw on 2016/6/1.
 */
public class UserCreateEvent {

    private String username;

    private String password;

    public UserCreateEvent(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
