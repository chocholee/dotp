package com.dotp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by sherw on 2016/5/25.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "/index";
    }

}
