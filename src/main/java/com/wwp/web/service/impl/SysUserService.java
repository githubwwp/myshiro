package com.wwp.web.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wwp.web.dao.impl.SysUserMapper;
import com.wwp.web.entity.SysUser;

@Service
public class SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    public List<SysUser> queryPageUser() {
        return sysUserMapper.queryPageUser();
    }

    /**
     * 新增用户
     * 
     * @param sysUser
     * @return
     */
    public int insertUser(SysUser sysUser) {
        return sysUserMapper.insertUser(sysUser);
    }

    /**
     * 删除用户
     * 
     * @param sysUser
     * @return
     */
    public int delUser(SysUser sysUser) {
        return sysUserMapper.delUser(sysUser);
    }

    /**
     * 根据用户名获取用户信息
     * 
     * @param username
     * @return
     */
    public String queryByUsername(String username) {
        return sysUserMapper.queryByUsername(username);
    }

    /**
     * 获取用户角色
     * 
     * @param username
     * @return
     */
    public Set<String> getUserRoles(String username) {
        return sysUserMapper.getUserRoles(username);
    }

    /**
     * 获取用户权限
     * 
     * @param username
     * @return
     */
    public Set<String> getUserPermissons(String username) {
        return sysUserMapper.getUserPermissons(username);
    }

}
