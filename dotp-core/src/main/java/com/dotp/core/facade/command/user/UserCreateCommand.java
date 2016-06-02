package com.dotp.core.facade.command.user;

/**
 * Created by sherw on 2016/6/1.
 */
public class UserCreateCommand {

    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
