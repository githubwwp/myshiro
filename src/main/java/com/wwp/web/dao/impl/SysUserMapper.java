package com.wwp.web.dao.impl;

import java.util.List;
import java.util.Set;

import org.springframework.web.bind.annotation.RequestParam;

import com.wwp.web.entity.SysUser;

public interface SysUserMapper {
    List<SysUser> queryPageUser();

    int insertUser(SysUser sysUser);
    
    int delUser(SysUser sysUser);
    
    String queryByUsername(@RequestParam("username") String username);
    
    Set<String> getUserRoles(String username);
    
    Set<String> getUserPermissons(String username);
    
}