package com.wwp.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wwp.entity.vo.MenuTreeVo;
import com.wwp.entity.vo.MenuVo;
import com.wwp.web.dao.impl.MenuMapper;
import com.wwp.web.entity.Menu;

@Service
public class MenuService {
	
	@Autowired
	private MenuMapper menuMapper;
	
	/**
	 * 初始化菜单
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
	
	/**
	 * 获取全部菜单
	 * @return
	 */
	public List<MenuVo> getAllMenus(){
	    return menuMapper.getAllMenus();
	}
	
	/**
	 * 获取菜单树
	 * @return
	 */
	public List<MenuTreeVo> getMenuTree(){
	    return menuMapper.getMenuTree();
	}
	
	public Menu selectByPrimaryKey(String id) {
		return menuMapper.selectByPrimaryKey(id);
	}

}
