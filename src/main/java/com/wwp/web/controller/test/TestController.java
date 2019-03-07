package com.wwp.web.controller.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import net.sf.json.spring.web.servlet.view.JsonView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.wwp.entity.vo.GridVo;
import com.wwp.web.entity.Menu;
import com.wwp.web.service.impl.MenuService;

@Controller
@RequestMapping("test")
public class TestController {
	
	@Autowired
	private MenuService menuService;

	@RequestMapping("test")
	public ModelAndView test() {
		System.out.println("test");

		return new ModelAndView(new JsonView(), new HashMap<String, Object>());
	}

	@RequestMapping("getGridData")
	public ModelAndView getGridData() {
		Map<String, Object> map = new HashMap<String, Object>();
		List<GridVo> gridList = new ArrayList<GridVo>();
		for (int i = 0; i < 100; i++) {
			GridVo gv = new GridVo();
			gv.setId(i);
			gv.setUsername(UUID.randomUUID().toString());
			gv.setGender(i % 3 == 0 ? "男" : "女");
			gv.setCity("city_" + i);
			gv.setPoint(new Random().nextInt());

			gridList.add(gv);
		}
		map.put("data", gridList);
		map.put("code", 0);
		map.put("count", gridList.size());
		map.put("msg", "succ");

		return new ModelAndView(new JsonView(), map);
	}
	
	/**
	 * 初始化全部菜单
	 * 2019-3-7 by wwp
	 * @param data
	 * @return 
	 * ModelAndView
	 */
	@RequestMapping("handleNavData")
	public ModelAndView handleNavData(String data) {
		Map<String, Object> rstMap = new HashMap<String, Object>();
		List<Menu> menus = JSONObject.parseArray(data, Menu.class);

		menuService.defaultMenus(menus);
		
		rstMap.put("menus", menus);
		return new ModelAndView(new JsonView(), rstMap);
	}
}
