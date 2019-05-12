package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.MenuItem;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.Container.Name;

public class HAS_MENU_ITEM implements Container.HasMenuItem {

	private static final long serialVersionUID = 1L;

	public List<MenuItem> menuItemList;

	public HAS_MENU_ITEM() {
	}

	public HAS_MENU_ITEM(String string) {
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

	public HAS_MENU_ITEM(MenuItem menuItem) {
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

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
