package com.dotp.core.infrastructure.generic;

import com.mongodb.WriteResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by sherw on 2016/6/2.
 */
@SuppressWarnings("unchecked")
@Repository
public abstract class AbstractMongoRepository<T, ID extends Serializable> implements IMongoRepository<T, ID> {

    private Class<T> persistentClass;

    public AbstractMongoRepository() {
        this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public T findBy(Query query) {
        return (T) mongoTemplate.findOne(query, getClass());
    }

    @Override
    public T findById(ID id) {
        return (T) mongoTemplate.findById(id, getClass());
    }

    @Override
    public List<T> findAll() {
        return (List<T>) mongoTemplate.findAll(getClass());
    }

    @Override
    public List<T> findAllBy(Query query) {
        return (List<T>) mongoTemplate.find(query, getClass());
    }

    @Override
    public void save(T entity) {
        mongoTemplate.save(entity);
    }

    @Override
    public WriteResult delete(T entity) {
        return mongoTemplate.remove(entity);
    }

    @Override
    public WriteResult delete(Query query) {
        return mongoTemplate.remove(query, getClass());
    }

    @Override
    public WriteResult update(Query query, Update update) {
        return mongoTemplate.upsert(query, update, getClass());
    }

}
