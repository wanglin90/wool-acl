package com.wool.acl.dao;

import com.wool.acl.model.database.User;
import com.wool.acl.model.database.UserExample;

import java.util.List;

/**
 * Created by wanglin on 17-1-18.
 */
public interface UserDao {

    List<User> selectByExampleWithLimit(UserExample example);

    void updateByPrimaryKeySelective(User record);

    User selectByPrimaryKey(Integer id);

    int countByExample(UserExample example);
}
