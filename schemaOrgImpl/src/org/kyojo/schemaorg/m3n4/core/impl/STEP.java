package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.CreativeWork;
import org.kyojo.schemaorg.m3n4.core.Clazz.HowToSection;
import org.kyojo.schemaorg.m3n4.core.Clazz.HowToStep;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.DataType.Text;

public class STEP implements Container.Step {

	private static final long serialVersionUID = 1L;

	public List<CreativeWork> creativeWorkList;
	public List<HowToSection> howToSectionList;
	public List<HowToStep> howToStepList;
	public List<Text> textList;

	public STEP() {
	}

	public STEP(CreativeWork creativeWork) {
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

	public STEP(HowToSection howToSection) {
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

	public STEP(HowToStep howToStep) {
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

	public STEP(String string) {
		this(new TEXT(string));
	}

	public STEP(Text text) {
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

	public STEP(List<CreativeWork> creativeWorkList,
			List<HowToSection> howToSectionList,
			List<HowToStep> howToStepList,
			List<Text> textList) {
		setCreativeWorkList(creativeWorkList);
		setHowToSectionList(howToSectionList);
		setHowToStepList(howToStepList);
		setTextList(textList);
	}

	public void copy(Container.Step org) {
		setCreativeWorkList(org.getCreativeWorkList());
		setHowToSectionList(org.getHowToSectionList());
		setHowToStepList(org.getHowToStepList());
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
