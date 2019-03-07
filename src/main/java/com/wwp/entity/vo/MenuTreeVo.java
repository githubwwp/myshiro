package com.wwp.entity.vo;

import java.util.List;

public class MenuTreeVo {

    private String id;
    private String pid;
    private String name;
    private String title;
    private String jump;
    private String icon;
    private boolean spread;
    private List<MenuTreeVo> children;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getJump() {
        return jump;
    }

    public void setJump(String jump) {
        this.jump = jump;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public boolean isSpread() {
        return spread;
    }

    public void setSpread(boolean spread) {
        this.spread = spread;
    }

    public List<MenuTreeVo> getChildren() {
        return children;
    }

    public void setChildren(List<MenuTreeVo> children) {
        this.children = children;
    }

}
