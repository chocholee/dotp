package com.dotp.core.domain.service.user;

import com.dotp.core.domain.model.user.UserEntry;
import com.dotp.core.facade.event.user.UserCreateEvent;

/**
 * Created by sherw on 2016/6/2.
 */
public interface IUserEntryService {

    UserEntry save(UserCreateEvent event);

}
