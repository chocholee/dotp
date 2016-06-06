package com.dotp.core.domain.model.user;

import com.dotp.core.commons.entity.AbstractEntity;
import com.dotp.core.commons.entity.vo.user.UserInfo;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by sherw on 2016/6/2.
 */
@Document(collection = "user")
public class UserEntity extends AbstractEntity {

    private String      username;

    private String      password;

    private String      salt;

    private UserInfo    userInfo;

    private Date        updatedDate;

    private Date        createDate;

    public UserEntity() {
        super();
    }

    public UserEntity(String username, String password, String salt, UserInfo userInfo) {
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.userInfo = userInfo;
        this.updatedDate = new Date();
        this.createDate = new Date();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getSalt() {
        return salt;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    @Id
    @Override
    protected void setId(String id) {
        super.setId(id);
    }

    @Version
    @Override
    protected void setVersion(String version) {
        super.setVersion(version);
    }

}
