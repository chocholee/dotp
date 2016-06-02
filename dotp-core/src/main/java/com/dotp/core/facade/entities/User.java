package com.dotp.core.facade.entities;

import com.alibaba.fastjson.JSON;
import com.dotp.core.facade.event.user.UserCreateEvent;
import org.axonframework.eventhandling.annotation.EventHandler;
import org.axonframework.eventsourcing.annotation.AbstractAnnotatedAggregateRoot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by sherw on 2016/6/2.
 */
public class User extends AbstractAnnotatedAggregateRoot {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private String identifierId;

    public User() {
    }

    public User(String username, String password) {
        apply(new UserCreateEvent(username, password));
    }

    @EventHandler
    public void handleUserCreateEvent(UserCreateEvent event) {
        logger.warn("event:[{}]", JSON.toJSONString(event));
        this.identifierId = event.getUsername();
    }

    @Override
    public Object getIdentifier() {
        return identifierId;
    }
}
