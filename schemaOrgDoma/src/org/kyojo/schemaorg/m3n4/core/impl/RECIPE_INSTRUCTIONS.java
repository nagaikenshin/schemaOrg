package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.CreativeWork;
import org.kyojo.schemaorg.m3n4.core.Clazz.HowToSection;
import org.kyojo.schemaorg.m3n4.core.Clazz.HowToStep;
import org.kyojo.schemaorg.m3n4.core.Clazz.ItemList;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.DataType.Text;

import org.seasar.doma.Transient;

public class RECIPE_INSTRUCTIONS implements Container.RecipeInstructions {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<CreativeWork> creativeWorkList;
	@Transient
	public List<HowToSection> howToSectionList;
	@Transient
	public List<HowToStep> howToStepList;
	@Transient
	public List<ItemList> itemListList;
	@Transient
	public List<Text> textList;

	public RECIPE_INSTRUCTIONS() {
	}

	public RECIPE_INSTRUCTIONS(CreativeWork creativeWork) {
		creativeWorkList = new ArrayList<CreativeWork>();
		creativeWorkList.add(creativeWork);
	}

	@Override
	public CreativeWork getCreativeWork() {
		if(creativeWorkList != null && creativeWorkList.size() > 0) {
			return creativeWorkList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCreativeWork(CreativeWork creativeWork) {
		if(creativeWorkList == null) {
			creativeWorkList = new ArrayList<>();
		}
		if(creativeWorkList.size() == 0) {
			creativeWorkList.add(creativeWork);
		} else {
			creativeWorkList.set(0, creativeWork);
		}
	}

	@Override
	public List<CreativeWork> getCreativeWorkList() {
		return creativeWorkList;
	}

	@Override
	public void setCreativeWorkList(List<CreativeWork> creativeWorkList) {
		this.creativeWorkList = creativeWorkList;
	}

	@Override
	public boolean hasCreativeWork() {
		return creativeWorkList != null && creativeWorkList.size() > 0 && creativeWorkList.get(0) != null;
	}

	public RECIPE_INSTRUCTIONS(HowToSection howToSection) {
		howToSectionList = new ArrayList<HowToSection>();
		howToSectionList.add(howToSection);
	}

	@Override
	public HowToSection getHowToSection() {
		if(howToSectionList != null && howToSectionList.size() > 0) {
			return howToSectionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHowToSection(HowToSection howToSection) {
		if(howToSectionList == null) {
			howToSectionList = new ArrayList<>();
		}
		if(howToSectionList.size() == 0) {
			howToSectionList.add(howToSection);
		} else {
			howToSectionList.set(0, howToSection);
		}
	}

	@Override
	public List<HowToSection> getHowToSectionList() {
		return howToSectionList;
	}

	@Override
	public void setHowToSectionList(List<HowToSection> howToSectionList) {
		this.howToSectionList = howToSectionList;
	}

	@Override
	public boolean hasHowToSection() {
		return howToSectionList != null && howToSectionList.size() > 0 && howToSectionList.get(0) != null;
	}

	public RECIPE_INSTRUCTIONS(HowToStep howToStep) {
		howToStepList = new ArrayList<HowToStep>();
		howToStepList.add(howToStep);
	}

	@Override
	public HowToStep getHowToStep() {
		if(howToStepList != null && howToStepList.size() > 0) {
			return howToStepList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHowToStep(HowToStep howToStep) {
		if(howToStepList == null) {
			howToStepList = new ArrayList<>();
		}
		if(howToStepList.size() == 0) {
			howToStepList.add(howToStep);
		} else {
			howToStepList.set(0, howToStep);
		}
	}

	@Override
	public List<HowToStep> getHowToStepList() {
		return howToStepList;
	}

	@Override
	public void setHowToStepList(List<HowToStep> howToStepList) {
		this.howToStepList = howToStepList;
	}

	@Override
	public boolean hasHowToStep() {
		return howToStepList != null && howToStepList.size() > 0 && howToStepList.get(0) != null;
	}

	public RECIPE_INSTRUCTIONS(ItemList itemList) {
		itemListList = new ArrayList<ItemList>();
		itemListList.add(itemList);
	}

	@Override
	public ItemList getItemList() {
		if(itemListList != null && itemListList.size() > 0) {
			return itemListList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setItemList(ItemList itemList) {
		if(itemListList == null) {
			itemListList = new ArrayList<>();
		}
		if(itemListList.size() == 0) {
			itemListList.add(itemList);
		} else {
			itemListList.set(0, itemList);
		}
	}

	@Override
	public List<ItemList> getItemListList() {
		return itemListList;
	}

	@Override
	public void setItemListList(List<ItemList> itemListList) {
		this.itemListList = itemListList;
	}

	@Override
	public boolean hasItemList() {
		return itemListList != null && itemListList.size() > 0 && itemListList.get(0) != null;
	}

	public RECIPE_INSTRUCTIONS(String string) {
		this(new TEXT(string));
	}

	public RECIPE_INSTRUCTIONS(Text text) {
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

	public RECIPE_INSTRUCTIONS(List<CreativeWork> creativeWorkList,
			List<HowToSection> howToSectionList,
			List<HowToStep> howToStepList,
			List<ItemList> itemListList,
			List<Text> textList) {
		setCreativeWorkList(creativeWorkList);
		setHowToSectionList(howToSectionList);
		setHowToStepList(howToStepList);
		setItemListList(itemListList);
		setTextList(textList);
	}

	public void copy(Container.RecipeInstructions org) {
		setCreativeWorkList(org.getCreativeWorkList());
		setHowToSectionList(org.getHowToSectionList());
		setHowToStepList(org.getHowToStepList());
		setItemListList(org.getItemListList());
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