package com.wool.acl.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wanglin on 17-1-19.
 */
@Controller
public class WebPageController {

    @RequestMapping(value = "/index")
    String index(Model model) {
        model.addAttribute("name", "wool-acl");
        return "index";
    }
}
