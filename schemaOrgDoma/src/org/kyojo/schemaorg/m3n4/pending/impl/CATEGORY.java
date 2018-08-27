package org.kyojo.schemaorg.m3n4.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.Thing;
import org.kyojo.schemaorg.m3n4.core.DataType.Text;
import org.kyojo.schemaorg.m3n4.core.impl.TEXT;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.PhysicalActivityCategory;
import org.kyojo.schemaorg.m3n4.pending.Container;

import org.seasar.doma.Transient;

public class CATEGORY implements Container.Category {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<PhysicalActivityCategory> physicalActivityCategoryList;
	@Transient
	public List<Text> textList;
	@Transient
	public List<Thing> thingList;

	public CATEGORY() {
	}

	public CATEGORY(PhysicalActivityCategory physicalActivityCategory) {
		physicalActivityCategoryList = new ArrayList<PhysicalActivityCategory>();
		physicalActivityCategoryList.add(physicalActivityCategory);
	}

	@Override
	public PhysicalActivityCategory getPhysicalActivityCategory() {
		if(physicalActivityCategoryList != null && physicalActivityCategoryList.size() > 0) {
			return physicalActivityCategoryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPhysicalActivityCategory(PhysicalActivityCategory physicalActivityCategory) {
		if(physicalActivityCategoryList == null) {
			physicalActivityCategoryList = new ArrayList<>();
		}
		if(physicalActivityCategoryList.size() == 0) {
			physicalActivityCategoryList.add(physicalActivityCategory);
		} else {
			physicalActivityCategoryList.set(0, physicalActivityCategory);
		}
	}

	@Override
	public List<PhysicalActivityCategory> getPhysicalActivityCategoryList() {
		return physicalActivityCategoryList;
	}

	@Override
	public void setPhysicalActivityCategoryList(List<PhysicalActivityCategory> physicalActivityCategoryList) {
		this.physicalActivityCategoryList = physicalActivityCategoryList;
	}

	@Override
	public boolean hasPhysicalActivityCategory() {
		return physicalActivityCategoryList != null && physicalActivityCategoryList.size() > 0 && physicalActivityCategoryList.get(0) != null;
	}

	public CATEGORY(String string) {
		this(new TEXT(string));
	}

	public CATEGORY(Text text) {
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

	public CATEGORY(Thing thing) {
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

	public CATEGORY(List<PhysicalActivityCategory> physicalActivityCategoryList,
			List<Text> textList,
			List<Thing> thingList) {
		setPhysicalActivityCategoryList(physicalActivityCategoryList);
		setTextList(textList);
		setThingList(thingList);
	}

	public void copy(Container.Category org) {
		setPhysicalActivityCategoryList(org.getPhysicalActivityCategoryList());
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
