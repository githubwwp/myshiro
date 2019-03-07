package com.wwp.web.dao.impl;

import java.util.List;

import com.wwp.web.entity.Menu;

public interface MenuMapper {
    int deleteByPrimaryKey(String id);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
    
    int deleteAllMenu();
    
    void batchInsertMenus(List<Menu> menus);
    
}