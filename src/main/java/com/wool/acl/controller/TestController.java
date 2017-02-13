package com.wool.acl.controller;

import com.wool.acl.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wanglin on 17-1-17.
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test", method = {RequestMethod.GET, RequestMethod.POST},produces = "application/json;charset=utf-8")
    public void hello() {
        String res = testService.hello("world");
        System.out.println(res);
    }
}
