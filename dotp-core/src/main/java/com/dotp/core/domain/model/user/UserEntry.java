package com.dotp.core.domain.model.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by sherw on 2016/6/2.
 */
@Document(collection = "user")
public class UserEntry {

    @Id
    private String id;

    @Field(value = "username")
    private String username;

    @Field(value = "password")
    private String password;

    public UserEntry() {
    }

    public UserEntry(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
