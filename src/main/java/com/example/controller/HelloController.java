package com.example.controller;

import com.example.pojo.Ob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {

    @Value("${name.haha}")
    private String name;

    @Autowired
    private Ob ob;
    @Autowired
    private Environment env;
    @RequestMapping("/login")
    public ModelAndView hello(ModelAndView modelAndView)
    {
        modelAndView.getModel().put("hello","haha");
        modelAndView.setViewName("login");
        return modelAndView;
        //return "hellp";
    }
}
