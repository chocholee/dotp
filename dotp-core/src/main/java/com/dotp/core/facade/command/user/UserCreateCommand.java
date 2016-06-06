package com.dotp.core.facade.command.user;

/**
 * Created by sherw on 2016/6/1.
 */
public class UserCreateCommand {

    private String username;

    private String password;

    public UserCreateCommand(String username, String password) {
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
