package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.GenderType;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.DataType.Text;

public class GENDER implements Container.Gender {

	private static final long serialVersionUID = 1L;

	public List<GenderType> genderTypeList;
	public List<Text> textList;

	public GENDER() {
	}

	public GENDER(GenderType genderType) {
		genderTypeList = new ArrayList<GenderType>();
		genderTypeList.add(genderType);
	}

	@Override
	public GenderType getGenderType() {
		if(genderTypeList != null && genderTypeList.size() > 0) {
			return genderTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setGenderType(GenderType genderType) {
		if(genderTypeList == null) {
			genderTypeList = new ArrayList<>();
		}
		if(genderTypeList.size() == 0) {
			genderTypeList.add(genderType);
		} else {
			genderTypeList.set(0, genderType);
		}
	}

	@Override
	public List<GenderType> getGenderTypeList() {
		return genderTypeList;
	}

	@Override
	public void setGenderTypeList(List<GenderType> genderTypeList) {
		this.genderTypeList = genderTypeList;
	}

	@Override
	public boolean hasGenderType() {
		return genderTypeList != null && genderTypeList.size() > 0 && genderTypeList.get(0) != null;
	}

	public GENDER(String string) {
		this(new TEXT(string));
	}

	public GENDER(Text text) {
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

	public GENDER(List<GenderType> genderTypeList,
			List<Text> textList) {
		setGenderTypeList(genderTypeList);
		setTextList(textList);
	}

	public void copy(Container.Gender org) {
		setGenderTypeList(org.getGenderTypeList());
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
