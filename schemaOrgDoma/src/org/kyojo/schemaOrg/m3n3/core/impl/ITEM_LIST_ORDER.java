package org.kyojo.schemaorg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz.ItemListOrderType;
import org.kyojo.schemaorg.m3n3.core.Container;
import org.kyojo.schemaorg.m3n3.core.DataType.Text;

import org.seasar.doma.Transient;

public class ITEM_LIST_ORDER implements Container.ItemListOrder {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<ItemListOrderType> itemListOrderTypeList;
	@Transient
	public List<Text> textList;

	public ITEM_LIST_ORDER() {
	}

	public ITEM_LIST_ORDER(ItemListOrderType itemListOrderType) {
		itemListOrderTypeList = new ArrayList<ItemListOrderType>();
		itemListOrderTypeList.add(itemListOrderType);
	}

	@Override
	public ItemListOrderType getItemListOrderType() {
		if(itemListOrderTypeList != null && itemListOrderTypeList.size() > 0) {
			return itemListOrderTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setItemListOrderType(ItemListOrderType itemListOrderType) {
		if(itemListOrderTypeList == null) {
			itemListOrderTypeList = new ArrayList<>();
		}
		if(itemListOrderTypeList.size() == 0) {
			itemListOrderTypeList.add(itemListOrderType);
		} else {
			itemListOrderTypeList.set(0, itemListOrderType);
		}
	}

	@Override
	public List<ItemListOrderType> getItemListOrderTypeList() {
		return itemListOrderTypeList;
	}

	@Override
	public void setItemListOrderTypeList(List<ItemListOrderType> itemListOrderTypeList) {
		this.itemListOrderTypeList = itemListOrderTypeList;
	}

	@Override
	public boolean hasItemListOrderType() {
		return itemListOrderTypeList != null && itemListOrderTypeList.size() > 0 && itemListOrderTypeList.get(0) != null;
	}

	public ITEM_LIST_ORDER(String string) {
		this(new TEXT(string));
	}

	public ITEM_LIST_ORDER(Text text) {
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

	public ITEM_LIST_ORDER(List<ItemListOrderType> itemListOrderTypeList,
			List<Text> textList) {
		setItemListOrderTypeList(itemListOrderTypeList);
		setTextList(textList);
	}

	public void copy(Container.ItemListOrder org) {
		setItemListOrderTypeList(org.getItemListOrderTypeList());
		setTextList(org.getTextList());
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
