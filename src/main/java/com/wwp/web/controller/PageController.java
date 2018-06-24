package com.wwp.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wwp.web.entity.SysRole;
import com.wwp.web.entity.SysUser;
import com.wwp.web.service.impl.SysRoleService;
import com.wwp.web.service.impl.SysUserService;

@Controller
@RequestMapping("page")
public class PageController extends BaseController {

    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private SysRoleService roleService;

    @RequiresRoles("administrator")
    @RequestMapping("userManageJsp")
    public ModelAndView userManageJsp(String username, Integer pageNum, Integer pageSize) {
        Map<String, Object> model = new HashMap<String, Object>();
        PageHelper.startPage(pageNum == null ? 1 : pageNum, pageSize == null ? 10 : pageSize);
        List<SysUser> sysUsers = sysUserService.queryPageUser();
        PageInfo<SysUser> pageInfo = new PageInfo<SysUser>(sysUsers);

        model.put("pi", pageInfo);
        return new ModelAndView("/jsp/sysmanage/userManage.jsp", model);
    }
    
    @RequestMapping("roleManageJsp")
    public ModelAndView roleManageJsp(Integer pageNum, Integer pageSize) {
        Map<String, Object> model = new HashMap<String, Object>();
        PageHelper.startPage(pageNum == null ? 1 : pageNum, pageSize == null ? 10 : pageSize);
        List<SysRole> sysRoles = roleService.queryPageRole();
        PageInfo<SysRole> pageInfo = new PageInfo<SysRole>(sysRoles);

        model.put("pi", pageInfo);
        return new ModelAndView("/jsp/sysmanage/roleManage.jsp", model);
    }

    @RequestMapping("addUserJsp")
    public String addUserJsp() {
        return "/jsp/sysmanage/addUser.jsp";
    }
    
    @RequestMapping("loginJsp")
    public String loginJsp(){
        return "redirect:/login.jsp";
    }
    
    @RequestMapping("indexJsp")
    public String indexJsp(){
        return "redirect:/index.jsp";
    }

}
