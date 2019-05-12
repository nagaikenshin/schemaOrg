package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.MenuSection;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.Container.Name;

public class HAS_MENU_SECTION implements Container.HasMenuSection {

	private static final long serialVersionUID = 1L;

	public List<MenuSection> menuSectionList;

	public HAS_MENU_SECTION() {
	}

	public HAS_MENU_SECTION(String string) {
		this(new MENU_SECTION(string));
	}

	public String getString() {
		if(menuSectionList == null || menuSectionList.size() == 0 || menuSectionList.get(0) == null) {
			return null;
		} else {
			Name name = menuSectionList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(menuSectionList == null) {
			menuSectionList = new ArrayList<MenuSection>();
		}
		if(menuSectionList.size() == 0) {
			menuSectionList.add(new MENU_SECTION(string));
		} else {
			menuSectionList.set(0, new MENU_SECTION(string));
		}
	}

	public HAS_MENU_SECTION(MenuSection menuSection) {
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

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
