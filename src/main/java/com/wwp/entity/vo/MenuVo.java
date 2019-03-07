package com.wwp.entity.vo;

public class MenuVo {

	private String id;
	private String pid;
	private String name;
	private String title;
	private String jump;
	private String icon;
	private MenuVo list;

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

	public MenuVo getList() {
		return list;
	}

	public void setList(MenuVo list) {
		this.list = list;
	}

}
