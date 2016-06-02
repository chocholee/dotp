package com.dotp.core.domain.model.user;

import com.dotp.core.infrastructure.generic.IMongoRepository;

import java.io.Serializable;

/**
 * Created by sherw on 2016/6/2.
 */
public interface IUserEntryRepository<T, ID extends Serializable> extends IMongoRepository<T, ID> {
}
