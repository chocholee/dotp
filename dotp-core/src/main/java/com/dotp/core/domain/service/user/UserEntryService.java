package com.dotp.core.domain.service.user;

import com.dotp.core.domain.model.user.IUserEntryRepository;
import com.dotp.core.domain.model.user.UserEntity;
import com.dotp.core.facade.event.user.UserCreateEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sherw on 2016/6/2.
 */
@Service("userEntryService")
public class UserEntryService implements IUserEntryService {

    @Autowired
    private IUserEntryRepository<UserEntity, String> userEntryRepository;

    @Override
    public UserEntity save(UserCreateEvent event) {
        return null;
    }
}
