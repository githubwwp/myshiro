package com.wwp.web.controller.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wwp.web.controller.BaseController;
import com.wwp.web.entity.SysUser;
import com.wwp.web.service.impl.SysUserService;

@Controller
@RequestMapping("login")
public class LoginController extends BaseController {
    
    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("login.do")
    public ModelAndView login(String username, String password) {
        if(username == null || password == null){
            return new ModelAndView("redirect:/login.jsp");
        }
        
        

        return new ModelAndView("redirect:/index.jsp");
    }

}
