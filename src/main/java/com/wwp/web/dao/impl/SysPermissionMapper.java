package com.wwp.web.dao.impl;

import com.wwp.web.entity.SysPermission;

public interface SysPermissionMapper {
    int deleteByPrimaryKey(String pCode);

    int insert(SysPermission record);

    int insertSelective(SysPermission record);

    SysPermission selectByPrimaryKey(String pCode);

    int updateByPrimaryKeySelective(SysPermission record);

    int updateByPrimaryKey(SysPermission record);
}