package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.ListItem;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

import org.seasar.doma.Transient;

public class NEXT_ITEM implements Container.NextItem {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<ListItem> listItemList;

	public NEXT_ITEM() {
	}

	public NEXT_ITEM(String string) {
		this(new LIST_ITEM(string));
	}

	public String getString() {
		if(listItemList == null || listItemList.size() == 0 || listItemList.get(0) == null) {
			return null;
		} else {
			Name name = listItemList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(listItemList == null) {
			listItemList = new ArrayList<ListItem>();
		}
		if(listItemList.size() == 0) {
			listItemList.add(new LIST_ITEM(string));
		} else {
			listItemList.set(0, new LIST_ITEM(string));
		}
	}

	public NEXT_ITEM(ListItem listItem) {
		listItemList = new ArrayList<ListItem>();
		listItemList.add(listItem);
	}

	@Override
	public ListItem getListItem() {
		if(listItemList != null && listItemList.size() > 0) {
			return listItemList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setListItem(ListItem listItem) {
		if(listItemList == null) {
			listItemList = new ArrayList<>();
		}
		if(listItemList.size() == 0) {
			listItemList.add(listItem);
		} else {
			listItemList.set(0, listItem);
		}
	}

	@Override
	public List<ListItem> getListItemList() {
		return listItemList;
	}

	@Override
	public void setListItemList(List<ListItem> listItemList) {
		this.listItemList = listItemList;
	}

	@Override
	public boolean hasListItem() {
		return listItemList != null && listItemList.size() > 0 && listItemList.get(0) != null;
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
