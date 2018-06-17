package com.wwp.web.service.impl;

import java.util.List;

import mybatis_gene.entity.SysUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wwp.web.dao.impl.SysUserDao;

@Service
public class SysUserService {
    @Autowired
    private SysUserDao sysUserDao;

    public List<SysUser> queryAll() {
        return sysUserDao.queryAll();
    }
}
