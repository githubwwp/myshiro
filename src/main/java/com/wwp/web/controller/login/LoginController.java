package com.wwp.web.controller.login;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wwp.web.controller.BaseController;
import com.wwp.web.service.impl.SysUserService;

@Controller
@RequestMapping("login")
public class LoginController extends BaseController {
    
    @Autowired
    private SysUserService sysUserService;

    @RequestMapping(value="login", method=RequestMethod.POST)
    public String login(String username, String password) {
        
        Subject subject = SecurityUtils.getSubject();  
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);  
        try {  
            subject.login(token);
            Session session=subject.getSession();
            session.setAttribute("subject", subject);
            return "/page/indexJsp";
        } catch (AuthenticationException e) {  
            
            return "/page/loginJsp"; 
        }  
    }

}
