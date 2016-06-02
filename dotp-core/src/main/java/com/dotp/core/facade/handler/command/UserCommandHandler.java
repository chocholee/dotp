package com.dotp.core.facade.handler.command;

import com.alibaba.fastjson.JSON;
import com.dotp.core.facade.command.user.UserCreateCommand;
import com.dotp.core.facade.entities.User;
import org.axonframework.commandhandling.annotation.CommandHandler;
import org.axonframework.repository.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by sherw on 2016/6/1.
 */
@Component
public class UserCommandHandler {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private Repository<User> userEventSourcingRepository;

    @CommandHandler
    public void handler(final UserCreateCommand command) {
        logger.warn("command:[{}]", JSON.toJSONString(command));
        User user = new User(command.getUsername(), command.getPassword());
        userEventSourcingRepository.add(user);
    }

}
