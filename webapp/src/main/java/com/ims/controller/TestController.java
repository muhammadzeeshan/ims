package com.ims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class TestController {
    
    @RequestMapping("/test")
    public ModelAndView helloWorld() {
    	
        String message = "Test Hello World";
        return new ModelAndView("test", "message", message);
    }
}
