package com.wwp.web.service.impl;

import java.util.List;

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

}
