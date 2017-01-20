package com.wool.acl.service;

import com.wool.acl.model.UserReq;
import com.wool.acl.model.WoolResponse;

/**
 * Created by wanglin on 17-1-20.
 */
public interface UserService {

    WoolResponse queryUserList(UserReq req);

    WoolResponse queryUserByPrimaryKey(UserReq req);

    WoolResponse updateUserByPrimaryKey(UserReq req);
}
