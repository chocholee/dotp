package com.dotp.core.facade.entities;

import org.axonframework.commandhandling.annotation.TargetAggregateIdentifier;
import org.axonframework.eventsourcing.annotation.AbstractAnnotatedAggregateRoot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by sherw on 2016/6/2.
 */
public class User extends AbstractAnnotatedAggregateRoot {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @TargetAggregateIdentifier
    private String identifierId;



}
