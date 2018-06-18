package com.wwp.web.dao.impl;

import java.util.List;

import com.wwp.web.entity.SysUser;

public interface SysUserMapper {
    List<SysUser> queryPageUser();

    int insertUser(SysUser sysUser);
    
    int delUser(SysUser sysUser);
    
}