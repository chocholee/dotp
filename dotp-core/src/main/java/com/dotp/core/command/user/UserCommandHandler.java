package com.dotp.core.command.user;

import com.alibaba.fastjson.JSON;
import org.axonframework.commandhandling.annotation.CommandHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by sherw on 2016/6/1.
 */
@Component
public class UserCommandHandler {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @CommandHandler
    public void handler(final CreateUserCommand command) {
        logger.warn(JSON.toJSONString(command));
    }

}
