package com.dotp.web.controller;

import com.dotp.core.command.user.CreateUserCommand;
import org.axonframework.commandhandling.CommandBus;
import org.axonframework.commandhandling.GenericCommandMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by sherw on 2016/5/25.
 */
@Controller
public class IndexController {

    @Autowired
    private CommandBus commandBus;

    @RequestMapping("/")
    public String index() {
        return "/index";
    }

    @RequestMapping("/test")
    @ResponseBody
    public void test() {
        CreateUserCommand command = new CreateUserCommand();
        command.setUsername("liwenhe");
        command.setPassword("123123");
        commandBus.dispatch(new GenericCommandMessage<Object>(command));
    }

}
