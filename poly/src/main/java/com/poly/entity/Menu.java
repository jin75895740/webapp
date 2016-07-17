package com.poly.entity;
/**
 * 菜单表
 * @author 俞宏亮
 * @version 0.0.1
 * @date 2016年4月25日  下午5:00:24
 */
public class Menu extends BaseBean{

	//菜单id
	private Long menuId;
	//菜单名称
	private String menuName;
	//父级菜单id
	private Long menu_parent;
	public Long getMenuId() {
		return menuId;
	}
	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public Long getMenu_parent() {
		return menu_parent;
	}
	public void setMenu_parent(Long menu_parent) {
		this.menu_parent = menu_parent;
	}
	
	
}
