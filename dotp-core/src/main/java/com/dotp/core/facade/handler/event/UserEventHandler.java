package com.dotp.core.facade.handler.event;

import com.alibaba.fastjson.JSON;
import com.dotp.core.domain.service.user.IUserEntryService;
import com.dotp.core.facade.event.user.UserCreateEvent;
import org.axonframework.eventhandling.annotation.EventHandler;
import org.axonframework.saga.annotation.AbstractAnnotatedSaga;
import org.axonframework.saga.annotation.SagaEventHandler;
import org.axonframework.saga.annotation.StartSaga;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by sherw on 2016/6/2.
 */
public class UserEventHandler extends AbstractAnnotatedSaga {

    @Autowired
    private IUserEntryService userEntryService;

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @StartSaga
    @SagaEventHandler(associationProperty = "username")
    public void handleUserCreateEvent(UserCreateEvent event) {
        logger.warn("event:[{}]", JSON.toJSONString(event));
        userEntryService.save(event);
    }

}
