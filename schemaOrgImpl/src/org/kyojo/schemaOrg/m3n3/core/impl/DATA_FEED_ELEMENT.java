package org.kyojo.schemaorg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz.DataFeedItem;
import org.kyojo.schemaorg.m3n3.core.Clazz.Thing;
import org.kyojo.schemaorg.m3n3.core.Container;
import org.kyojo.schemaorg.m3n3.core.DataType.Text;

public class DATA_FEED_ELEMENT implements Container.DataFeedElement {

	private static final long serialVersionUID = 1L;

	public List<DataFeedItem> dataFeedItemList;
	public List<Text> textList;
	public List<Thing> thingList;

	public DATA_FEED_ELEMENT() {
	}

	public DATA_FEED_ELEMENT(DataFeedItem dataFeedItem) {
		dataFeedItemList = new ArrayList<DataFeedItem>();
		dataFeedItemList.add(dataFeedItem);
	}

	@Override
	public DataFeedItem getDataFeedItem() {
		if(dataFeedItemList != null && dataFeedItemList.size() > 0) {
			return dataFeedItemList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDataFeedItem(DataFeedItem dataFeedItem) {
		if(dataFeedItemList == null) {
			dataFeedItemList = new ArrayList<>();
		}
		if(dataFeedItemList.size() == 0) {
			dataFeedItemList.add(dataFeedItem);
		} else {
			dataFeedItemList.set(0, dataFeedItem);
		}
	}

	@Override
	public List<DataFeedItem> getDataFeedItemList() {
		return dataFeedItemList;
	}

	@Override
	public void setDataFeedItemList(List<DataFeedItem> dataFeedItemList) {
		this.dataFeedItemList = dataFeedItemList;
	}

	@Override
	public boolean hasDataFeedItem() {
		return dataFeedItemList != null && dataFeedItemList.size() > 0 && dataFeedItemList.get(0) != null;
	}

	public DATA_FEED_ELEMENT(String string) {
		this(new TEXT(string));
	}

	public DATA_FEED_ELEMENT(Text text) {
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

	public DATA_FEED_ELEMENT(Thing thing) {
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

	public DATA_FEED_ELEMENT(List<DataFeedItem> dataFeedItemList,
			List<Text> textList,
			List<Thing> thingList) {
		setDataFeedItemList(dataFeedItemList);
		setTextList(textList);
		setThingList(thingList);
	}

	public void copy(Container.DataFeedElement org) {
		setDataFeedItemList(org.getDataFeedItemList());
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
