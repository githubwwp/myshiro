package com.wwp.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wwp.web.entity.SysUser;
import com.wwp.web.service.impl.SysUserService;

@Component
public class SpringTest {

    @Autowired
    private SysUserService sysUserService;

    public void test() {
        List<SysUser> sysUsers = sysUserService.queryPageUser();
        System.out.println("sysUsers: " + sysUsers);
    }

}
