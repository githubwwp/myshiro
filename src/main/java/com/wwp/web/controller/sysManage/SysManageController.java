package com.wwp.web.controller.sysManage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.spring.web.servlet.view.JsonView;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wwp.web.controller.BaseController;
import com.wwp.web.entity.SysUser;
import com.wwp.web.service.impl.SysUserService;

@Controller
@RequestMapping("sysManage")
public class SysManageController extends BaseController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("addUser")
    public ModelAndView addUser(SysUser sysUser) {
        byte status = 1;
        sysUser.setStatus(status);
        sysUserService.insertUser(sysUser);
        return new ModelAndView("redirect:/page/userManageJsp.do");
    }

    @RequestMapping("queryPageUser")
    public ModelAndView queryPageUser(@RequestParam Map<String, Object> map) {
        Map<String, Object> model = new HashMap<String, Object>();
        PageHelper.startPage(0, 1);
        List<SysUser> sysUsers = sysUserService.queryPageUser();
        PageInfo<SysUser> pageInfo = new PageInfo<SysUser>(sysUsers);

        model.put("pi", pageInfo);
        return new ModelAndView(new JsonView(), model);
    }
    
    
    @RequestMapping("delUer")
    public ModelAndView delUer(SysUser sysUser) {
        sysUserService.delUser(sysUser);
        return new ModelAndView("redirect:/page/userManageJsp.do");
    }

}
