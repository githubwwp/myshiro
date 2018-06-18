package com.wwp.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wwp.web.dao.impl.SysRoleMapper;
import com.wwp.web.entity.SysRole;

@Service
public class SysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    public List<SysRole> queryPageRole() {
        return sysRoleMapper.queryPageRole();
    }

}
