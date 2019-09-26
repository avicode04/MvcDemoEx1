package com.stackroute.controller;

import com.stackroute.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @GetMapping("/show")
    public ModelAndView getValue()
    {
        User user = new User("Avinash",23);
        ModelAndView mv = new ModelAndView("display");
        mv.addObject("Value",user);
        return mv;
    }
}
