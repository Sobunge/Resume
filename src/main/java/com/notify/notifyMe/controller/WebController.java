package com.notify.notifyMe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    
    @RequestMapping(value="/index")
    public String index(){
    
        return "index";
    }
    
    @RequestMapping(value="/resume")
    public String resume(){
    
        return "resume";
    }
    
    @RequestMapping(value="/login")
    public String login(){
    
        return "login";
    }
    
    @RequestMapping(value="/registration")
    public String registration(){
    
        return "registration";
    }
}
