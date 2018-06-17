package com.wwp.test;

import java.util.List;

import mybatis_gene.entity.SysUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wwp.web.service.impl.SysUserService;

@Component
public class SpringTest {

    @Autowired
    private SysUserService sysUserService;

    public void test() {
        List<SysUser> sysUsers = sysUserService.queryAll();
        System.out.println("sysUsers: " + sysUsers);
    }

}
