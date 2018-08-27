package org.kyojo.schemaorg.m3n4.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.MenuItem;
import org.kyojo.schemaorg.m3n4.core.Clazz.MenuSection;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.core.impl.MENU_ITEM;
import org.kyojo.schemaorg.m3n4.pending.Container;

public class MENU_ADD_ON implements Container.MenuAddOn {

	private static final long serialVersionUID = 1L;

	public List<MenuItem> menuItemList;
	public List<MenuSection> menuSectionList;

	public MENU_ADD_ON() {
	}

	public MENU_ADD_ON(String string) {
		this(new MENU_ITEM(string));
	}

	public String getString() {
		if(menuItemList == null || menuItemList.size() == 0 || menuItemList.get(0) == null) {
			return null;
		} else {
			Name name = menuItemList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(menuItemList == null) {
			menuItemList = new ArrayList<MenuItem>();
		}
		if(menuItemList.size() == 0) {
			menuItemList.add(new MENU_ITEM(string));
		} else {
			menuItemList.set(0, new MENU_ITEM(string));
		}
	}

	public MENU_ADD_ON(MenuItem menuItem) {
		menuItemList = new ArrayList<MenuItem>();
		menuItemList.add(menuItem);
	}

	@Override
	public MenuItem getMenuItem() {
		if(menuItemList != null && menuItemList.size() > 0) {
			return menuItemList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMenuItem(MenuItem menuItem) {
		if(menuItemList == null) {
			menuItemList = new ArrayList<>();
		}
		if(menuItemList.size() == 0) {
			menuItemList.add(menuItem);
		} else {
			menuItemList.set(0, menuItem);
		}
	}

	@Override
	public List<MenuItem> getMenuItemList() {
		return menuItemList;
	}

	@Override
	public void setMenuItemList(List<MenuItem> menuItemList) {
		this.menuItemList = menuItemList;
	}

	@Override
	public boolean hasMenuItem() {
		return menuItemList != null && menuItemList.size() > 0 && menuItemList.get(0) != null;
	}

	public MENU_ADD_ON(MenuSection menuSection) {
		menuSectionList = new ArrayList<MenuSection>();
		menuSectionList.add(menuSection);
	}

	@Override
	public MenuSection getMenuSection() {
		if(menuSectionList != null && menuSectionList.size() > 0) {
			return menuSectionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMenuSection(MenuSection menuSection) {
		if(menuSectionList == null) {
			menuSectionList = new ArrayList<>();
		}
		if(menuSectionList.size() == 0) {
			menuSectionList.add(menuSection);
		} else {
			menuSectionList.set(0, menuSection);
		}
	}

	@Override
	public List<MenuSection> getMenuSectionList() {
		return menuSectionList;
	}

	@Override
	public void setMenuSectionList(List<MenuSection> menuSectionList) {
		this.menuSectionList = menuSectionList;
	}

	@Override
	public boolean hasMenuSection() {
		return menuSectionList != null && menuSectionList.size() > 0 && menuSectionList.get(0) != null;
	}

	public MENU_ADD_ON(List<MenuItem> menuItemList,
			List<MenuSection> menuSectionList) {
		setMenuItemList(menuItemList);
		setMenuSectionList(menuSectionList);
	}

	public void copy(Container.MenuAddOn org) {
		setMenuItemList(org.getMenuItemList());
		setMenuSectionList(org.getMenuSectionList());
	}

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
