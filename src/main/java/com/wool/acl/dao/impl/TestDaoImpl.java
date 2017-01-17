package com.wool.acl.dao.impl;

import com.wool.acl.dao.TestDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wanglin on 17-1-17.
 */
public class TestDaoImpl implements TestDao {

    public static final Logger logger = LoggerFactory.getLogger(TestDaoImpl.class);

    @Override
    public String hello(String s) {
        logger.debug(" hello : {}", s);
        return " hello : " + s;
    }
}
