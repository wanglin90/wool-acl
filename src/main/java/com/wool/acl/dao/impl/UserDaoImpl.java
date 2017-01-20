package com.wool.acl.dao.impl;

import com.wool.acl.dao.UserDao;
import com.wool.acl.dao.mapper.UserMapper;
import com.wool.acl.model.database.User;
import com.wool.acl.model.database.UserExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wanglin on 17-1-18.
 */
@Repository
public class UserDaoImpl implements UserDao {

    public static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectByExampleWithLimit(UserExample example) {
        return userMapper.selectByExampleWithLimit(example);
    }

    @Override
    public void updateByPrimaryKeySelective(User record) {
        userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int countByExample(UserExample example) {
        return userMapper.countByExample(example);
    }
}
