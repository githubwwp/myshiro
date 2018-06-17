package com.wwp.web.controller.login;

import java.util.HashMap;

import net.sf.json.spring.web.servlet.view.JsonView;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wwp.web.controller.BaseController;

@Controller
@RequestMapping("test")
public class TestController extends BaseController {

    
    @RequestMapping("test")
    public ModelAndView test(){
        
        return new ModelAndView(new JsonView(), new HashMap<String, Object>());
    }
    
}
