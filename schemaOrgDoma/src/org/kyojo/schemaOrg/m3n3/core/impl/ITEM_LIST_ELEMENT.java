package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ListItem;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Thing;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.DataType.Text;

import org.seasar.doma.Transient;

public class ITEM_LIST_ELEMENT implements Container.ItemListElement {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<ListItem> listItemList;
	@Transient
	public List<Text> textList;
	@Transient
	public List<Thing> thingList;

	public ITEM_LIST_ELEMENT() {
	}

	public ITEM_LIST_ELEMENT(ListItem listItem) {
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

	public ITEM_LIST_ELEMENT(String string) {
		this(new TEXT(string));
	}

	public ITEM_LIST_ELEMENT(Text text) {
		textList = new ArrayList<Text>();
		textList.add(text);
	}

	@Override
	public Text getText() {
		if(textList != null && textList.size() > 0) {
			return textList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setText(Text text) {
		if(textList == null) {
			textList = new ArrayList<>();
		}
		if(textList.size() == 0) {
			textList.add(text);
		} else {
			textList.set(0, text);
		}
	}

	@Override
	public List<Text> getTextList() {
		return textList;
	}

	@Override
	public void setTextList(List<Text> textList) {
		this.textList = textList;
	}

	@Override
	public boolean hasText() {
		return textList != null && textList.size() > 0 && textList.get(0) != null;
	}

	public ITEM_LIST_ELEMENT(Thing thing) {
		thingList = new ArrayList<Thing>();
		thingList.add(thing);
	}

	@Override
	public Thing getThing() {
		if(thingList != null && thingList.size() > 0) {
			return thingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setThing(Thing thing) {
		if(thingList == null) {
			thingList = new ArrayList<>();
		}
		if(thingList.size() == 0) {
			thingList.add(thing);
		} else {
			thingList.set(0, thing);
		}
	}

	@Override
	public List<Thing> getThingList() {
		return thingList;
	}

	@Override
	public void setThingList(List<Thing> thingList) {
		this.thingList = thingList;
	}

	@Override
	public boolean hasThing() {
		return thingList != null && thingList.size() > 0 && thingList.get(0) != null;
	}

	public ITEM_LIST_ELEMENT(List<ListItem> listItemList,
			List<Text> textList,
			List<Thing> thingList) {
		setListItemList(listItemList);
		setTextList(textList);
		setThingList(thingList);
	}

	public void copy(Container.ItemListElement org) {
		setListItemList(org.getListItemList());
		setTextList(org.getTextList());
		setThingList(org.getThingList());
	}

	@Override
	public String getNativeValue() {
		if(getText() == null) return null;
		return getText().getNativeValue();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
