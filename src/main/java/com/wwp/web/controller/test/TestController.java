package com.wwp.web.controller.test;

import java.util.HashMap;

import net.sf.json.spring.web.servlet.view.JsonView;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping("test")
    public ModelAndView test(){
        System.out.println("test");
        
        return new ModelAndView(new JsonView(), new HashMap());
    }
}
