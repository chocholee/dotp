package com.dotp.core.infrastructure.generic;

import com.mongodb.WriteResult;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.io.Serializable;
import java.util.List;

/**
 * Created by sherw on 2016/6/2.
 */
public interface IMongoRepository<T, ID extends Serializable> {

    T findBy(Query query);

    T findById(ID id);

    List<T> findAll();

    List<T> findAllBy(Query query);

    void save(T entity);

    WriteResult delete(T entity);

    WriteResult delete(Query query);

    WriteResult update(Query query, Update update);

}
