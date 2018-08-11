package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.HowToTool;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Thing;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.DataType.Text;

public class TOOL implements Container.Tool {

	private static final long serialVersionUID = 1L;

	public List<HowToTool> howToToolList;
	public List<Text> textList;
	public List<Thing> thingList;

	public TOOL() {
	}

	public TOOL(HowToTool howToTool) {
		howToToolList = new ArrayList<HowToTool>();
		howToToolList.add(howToTool);
	}

	@Override
	public HowToTool getHowToTool() {
		if(howToToolList != null && howToToolList.size() > 0) {
			return howToToolList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHowToTool(HowToTool howToTool) {
		if(howToToolList == null) {
			howToToolList = new ArrayList<>();
		}
		if(howToToolList.size() == 0) {
			howToToolList.add(howToTool);
		} else {
			howToToolList.set(0, howToTool);
		}
	}

	@Override
	public List<HowToTool> getHowToToolList() {
		return howToToolList;
	}

	@Override
	public void setHowToToolList(List<HowToTool> howToToolList) {
		this.howToToolList = howToToolList;
	}

	@Override
	public boolean hasHowToTool() {
		return howToToolList != null && howToToolList.size() > 0 && howToToolList.get(0) != null;
	}

	public TOOL(String string) {
		this(new TEXT(string));
	}

	public TOOL(Text text) {
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

	public TOOL(Thing thing) {
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

	public TOOL(List<HowToTool> howToToolList,
			List<Text> textList,
			List<Thing> thingList) {
		setHowToToolList(howToToolList);
		setTextList(textList);
		setThingList(thingList);
	}

	public void copy(Container.Tool org) {
		setHowToToolList(org.getHowToToolList());
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
