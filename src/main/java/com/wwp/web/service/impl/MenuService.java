package com.wwp.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wwp.web.dao.impl.MenuMapper;
import com.wwp.web.entity.Menu;

@Service
public class MenuService {
	
	@Autowired
	private MenuMapper menuMapper;
	
	/**
	 * 获取全部菜单
	 * 2019-3-7 by wwp
	 * @param menus 
	 * void
	 */
	@Transactional(propagation=Propagation.REQUIRED)
	public void defaultMenus(List<Menu> menus){
		// 删除全部菜单
		menuMapper.deleteAllMenu();
		
		// 添加菜单
		menuMapper.batchInsertMenus(menus);
	}

}
