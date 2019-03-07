package com.wwp.web.controller.sysManage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.sf.json.spring.web.servlet.view.JsonView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wwp.entity.vo.MenuTreeVo;
import com.wwp.entity.vo.MenuVo;
import com.wwp.web.WebConstant;
import com.wwp.web.service.impl.MenuService;

@Controller
@RequestMapping("menu")
public class MenuManageController {

    @Autowired
    private MenuService menuService;

    /**
     * 获取全部菜单
     * 
     * @return
     */
    @RequestMapping("getLeftData")
    public ModelAndView getLeftData() {
        Map<String, Object> map = new HashMap<String, Object>();

        List<MenuVo> menus = menuService.getAllMenus();
        // 获取数结构菜单

        List<MenuVo> data = new ArrayList<MenuVo>();
        Iterator<MenuVo> iter = menus.iterator();
        while (iter.hasNext()) {
            MenuVo mv = iter.next();
            if ("root".equalsIgnoreCase(mv.getPid())) {
                data.add(mv);
                iter.remove();
                this.dgMenu(menus, mv);
            }
        }

        map.put(WebConstant.CODE, "0");
        map.put(WebConstant.MSG, "");
        map.put(WebConstant.DATA, data);

        return new ModelAndView(new JsonView(), map);
    }

    /**
     * 递归查询
     * 
     * @param list
     *            全部可用集合
     * @param pMenu
     *            父部门菜单
     */
    private void dgMenu(List<MenuVo> menus, MenuVo pMenu) {
        Iterator<MenuVo> iter = menus.iterator();
        while (iter.hasNext()) {
            MenuVo mv = iter.next();
            if (pMenu.getId().equalsIgnoreCase(mv.getPid())) {
                if (pMenu.getList() == null) {
                    pMenu.setList(new ArrayList<MenuVo>());
                }
                pMenu.getList().add(mv);

                // 递归
                this.dgMenu(menus, mv);
            }
        }
    }

    /**
     * 获取全部菜单树
     * 
     * @return
     */
    @RequestMapping("getMenuTree")
    public ModelAndView getMenuTree() {
        Map<String, Object> map = new HashMap<String, Object>();

        List<MenuTreeVo> menus = menuService.getMenuTree();
        // 获取数结构菜单

        List<MenuTreeVo> data = new ArrayList<MenuTreeVo>();
        Iterator<MenuTreeVo> iter = menus.iterator();
        while (iter.hasNext()) {
            MenuTreeVo mv = iter.next();
            if ("root".equalsIgnoreCase(mv.getPid())) {
                data.add(mv);
                iter.remove();
                this.dgMenu(menus, mv);
            }
        }

        map.put(WebConstant.CODE, "0");
        map.put(WebConstant.MSG, "");
        map.put(WebConstant.DATA, data);

        return new ModelAndView(new JsonView(), map);
    }

    /**
     * 递归查询
     * 
     * @param list
     *            全部可用集合
     * @param pMenu
     *            父部门菜单
     */
    private void dgMenu(List<MenuTreeVo> menus, MenuTreeVo pMenu) {
        Iterator<MenuTreeVo> iter = menus.iterator();
        while (iter.hasNext()) {
            MenuTreeVo mv = iter.next();
            if (pMenu.getId().equalsIgnoreCase(mv.getPid())) {
                if (pMenu.getChildren() == null) {
                    pMenu.setChildren(new ArrayList<MenuTreeVo>());
                }
                pMenu.getChildren().add(mv);

                // 递归
                this.dgMenu(menus, mv);
            }
        }
    }

}
