package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.HowToSupply;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Thing;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.DataType.Text;

public class RECIPE_INGREDIENT implements Container.RecipeIngredient {

	private static final long serialVersionUID = 1L;

	public List<HowToSupply> howToSupplyList;
	public List<Text> textList;
	public List<Thing> thingList;

	public RECIPE_INGREDIENT() {
	}

	public RECIPE_INGREDIENT(HowToSupply howToSupply) {
		howToSupplyList = new ArrayList<HowToSupply>();
		howToSupplyList.add(howToSupply);
	}

	@Override
	public HowToSupply getHowToSupply() {
		if(howToSupplyList != null && howToSupplyList.size() > 0) {
			return howToSupplyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHowToSupply(HowToSupply howToSupply) {
		if(howToSupplyList == null) {
			howToSupplyList = new ArrayList<>();
		}
		if(howToSupplyList.size() == 0) {
			howToSupplyList.add(howToSupply);
		} else {
			howToSupplyList.set(0, howToSupply);
		}
	}

	@Override
	public List<HowToSupply> getHowToSupplyList() {
		return howToSupplyList;
	}

	@Override
	public void setHowToSupplyList(List<HowToSupply> howToSupplyList) {
		this.howToSupplyList = howToSupplyList;
	}

	@Override
	public boolean hasHowToSupply() {
		return howToSupplyList != null && howToSupplyList.size() > 0 && howToSupplyList.get(0) != null;
	}

	public RECIPE_INGREDIENT(String string) {
		this(new TEXT(string));
	}

	public RECIPE_INGREDIENT(Text text) {
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

	public RECIPE_INGREDIENT(Thing thing) {
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

	public RECIPE_INGREDIENT(List<HowToSupply> howToSupplyList,
			List<Text> textList,
			List<Thing> thingList) {
		setHowToSupplyList(howToSupplyList);
		setTextList(textList);
		setThingList(thingList);
	}

	public void copy(Container.RecipeIngredient org) {
		setHowToSupplyList(org.getHowToSupplyList());
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
