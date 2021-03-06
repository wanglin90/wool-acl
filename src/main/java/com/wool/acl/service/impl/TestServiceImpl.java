package com.wool.acl.service.impl;

import com.wool.acl.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by wanglin on 17-1-17.
 */
@Service
public class TestServiceImpl implements TestService {

    public static final Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);

    @Override
    public String hello(String s) {
        logger.debug(" hello : {}", s);
        return " hello : " + s;
    }
}
