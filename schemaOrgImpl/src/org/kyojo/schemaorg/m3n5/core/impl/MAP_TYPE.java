package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.MapCategoryType;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.Container.Name;

public class MAP_TYPE implements Container.MapType {

	private static final long serialVersionUID = 1L;

	public List<MapCategoryType> mapCategoryTypeList;

	public MAP_TYPE() {
	}

	public MAP_TYPE(String string) {
		this(new MAP_CATEGORY_TYPE(string));
	}

	public String getString() {
		if(mapCategoryTypeList == null || mapCategoryTypeList.size() == 0 || mapCategoryTypeList.get(0) == null) {
			return null;
		} else {
			Name name = mapCategoryTypeList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(mapCategoryTypeList == null) {
			mapCategoryTypeList = new ArrayList<MapCategoryType>();
		}
		if(mapCategoryTypeList.size() == 0) {
			mapCategoryTypeList.add(new MAP_CATEGORY_TYPE(string));
		} else {
			mapCategoryTypeList.set(0, new MAP_CATEGORY_TYPE(string));
		}
	}

	public MAP_TYPE(MapCategoryType mapCategoryType) {
		mapCategoryTypeList = new ArrayList<MapCategoryType>();
		mapCategoryTypeList.add(mapCategoryType);
	}

	@Override
	public MapCategoryType getMapCategoryType() {
		if(mapCategoryTypeList != null && mapCategoryTypeList.size() > 0) {
			return mapCategoryTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMapCategoryType(MapCategoryType mapCategoryType) {
		if(mapCategoryTypeList == null) {
			mapCategoryTypeList = new ArrayList<>();
		}
		if(mapCategoryTypeList.size() == 0) {
			mapCategoryTypeList.add(mapCategoryType);
		} else {
			mapCategoryTypeList.set(0, mapCategoryType);
		}
	}

	@Override
	public List<MapCategoryType> getMapCategoryTypeList() {
		return mapCategoryTypeList;
	}

	@Override
	public void setMapCategoryTypeList(List<MapCategoryType> mapCategoryTypeList) {
		this.mapCategoryTypeList = mapCategoryTypeList;
	}

	@Override
	public boolean hasMapCategoryType() {
		return mapCategoryTypeList != null && mapCategoryTypeList.size() > 0 && mapCategoryTypeList.get(0) != null;
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
