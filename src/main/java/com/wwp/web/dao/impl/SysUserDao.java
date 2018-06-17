package com.wwp.web.dao.impl;

import java.util.List;

import mybatis_gene.entity.SysUser;

public interface SysUserDao {
    List<SysUser> queryAll();
}