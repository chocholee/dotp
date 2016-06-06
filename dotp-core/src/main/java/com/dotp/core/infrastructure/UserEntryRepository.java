package com.dotp.core.infrastructure;

import com.dotp.core.domain.model.user.IUserEntryRepository;
import com.dotp.core.domain.model.user.UserEntity;
import com.dotp.core.infrastructure.generic.AbstractMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sherw on 2016/6/2.
 */
@Repository("userEntryRepository")
public class UserEntryRepository extends AbstractMongoRepository<UserEntity, String>
        implements IUserEntryRepository<UserEntity, String> {
}
