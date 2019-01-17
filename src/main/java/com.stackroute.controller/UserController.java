package com.stackroute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    User user = new User();
    @RequestMapping(value="/")
    public String userMessage(ModelMap model){
        model.addAttribute("message",user.getUser());
        return "index";
    }


}
