package com.wool.acl.service.impl;

import com.wool.acl.dao.UserDao;
import com.wool.acl.exception.WoolException;
import com.wool.acl.model.UserReq;
import com.wool.acl.model.UserResp;
import com.wool.acl.model.WoolResponse;
import com.wool.acl.model.database.User;
import com.wool.acl.model.database.UserExample;
import com.wool.acl.service.UserService;
import com.wool.acl.utils.ErrorCode;
import com.wool.acl.utils.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wanglin on 17-1-20.
 */
@Service
public class UserServiceImpl implements UserService {

    public static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public WoolResponse queryUserList(UserReq req) {

        WoolResponse response = null;
        UserResp resp = new UserResp();
        int totalNum = 0;
        List<UserResp.WoolUserResp> list = new ArrayList<>();

        UserExample example = createUserExample(req);

        totalNum = userDao.countByExample(example);

        if (totalNum > 0) {
            List<User> users = userDao.selectByExampleWithLimit(example);
            for (User user : users) {
                UserResp.WoolUserResp woolUserResp = new UserResp.WoolUserResp();
                woolUserResp.setId(user.getId());
                woolUserResp.setLoginName(user.getLoginName());
                woolUserResp.setUserName(user.getUserName());
                woolUserResp.setMail(user.getMail());
                woolUserResp.setPhone(user.getPhone());
                woolUserResp.setPwDeadTime(user.getPwDeadTime());
                woolUserResp.setCtime(user.getCtime());
                woolUserResp.setValid(user.getIsValid());
                woolUserResp.setFailureTimes(Integer.parseInt(Byte.toString(user.getFailureTimes())));
                woolUserResp.setFailureTime(user.getFailureTime());
                woolUserResp.setLastLoginTime(user.getLastLoginTime());
                list.add(woolUserResp);
            }
        }

        resp.setTotalNum(totalNum);
        resp.setList(list);

        response = Utils.getRightResponse("success", resp);
        return response;
    }

    private UserExample createUserExample(UserReq req) {

        UserExample example = new UserExample();

        example.setOrderByClause("ctime desc");
        example.setLimitClause(req.getOffset(),req.getLimit());

        UserExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(req.getLoginName())) {
            criteria.andLoginNameEqualTo(req.getLoginName());
        }

        if (!StringUtils.isEmpty(req.getUserName())) {
            criteria.andLoginNameEqualTo(req.getUserName());
        }

        if (!StringUtils.isEmpty(req.getMail())) {
            criteria.andLoginNameEqualTo(req.getMail());
        }

        if (!StringUtils.isEmpty(req.getPhone())) {
            criteria.andLoginNameEqualTo(req.getPhone());
        }

        return example;
    }

    @Override
    public WoolResponse queryUserByPrimaryKey(UserReq req) {

        WoolResponse response = null;
        UserResp.WoolUserResp resp = new UserResp.WoolUserResp();

        User user = userDao.selectByPrimaryKey(req.getId());

        if (user == null) {
            throw new WoolException(ErrorCode.USER_RECORD_NOT_EXIST);
        }

        resp.setId(user.getId());
        resp.setLoginName(user.getLoginName());
        resp.setUserName(user.getUserName());
        resp.setMail(user.getMail());
        resp.setPhone(user.getPhone());
        resp.setPwDeadTime(user.getPwDeadTime());
        resp.setCtime(user.getCtime());
        resp.setValid(user.getIsValid());
        resp.setFailureTimes(Integer.parseInt(Byte.toString(user.getFailureTimes())));
        resp.setFailureTime(user.getFailureTime());
        resp.setLastLoginTime(user.getLastLoginTime());

        response = Utils.getRightResponse("success", resp);
        return response;
    }

    @Override
    public WoolResponse updateUserByPrimaryKey(UserReq req) {
        return null;
    }
}
