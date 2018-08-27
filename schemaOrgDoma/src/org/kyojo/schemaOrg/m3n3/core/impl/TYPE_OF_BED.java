package org.kyojo.schemaorg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Container;
import org.kyojo.schemaorg.m3n3.core.DataType.Text;
import org.kyojo.schemaorg.m3n3.pending.Clazz.BedType;

import org.seasar.doma.Transient;

public class TYPE_OF_BED implements Container.TypeOfBed {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<BedType> bedTypeList;
	@Transient
	public List<Text> textList;

	public TYPE_OF_BED() {
	}

	public TYPE_OF_BED(BedType bedType) {
		bedTypeList = new ArrayList<BedType>();
		bedTypeList.add(bedType);
	}

	@Override
	public BedType getBedType() {
		if(bedTypeList != null && bedTypeList.size() > 0) {
			return bedTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBedType(BedType bedType) {
		if(bedTypeList == null) {
			bedTypeList = new ArrayList<>();
		}
		if(bedTypeList.size() == 0) {
			bedTypeList.add(bedType);
		} else {
			bedTypeList.set(0, bedType);
		}
	}

	@Override
	public List<BedType> getBedTypeList() {
		return bedTypeList;
	}

	@Override
	public void setBedTypeList(List<BedType> bedTypeList) {
		this.bedTypeList = bedTypeList;
	}

	@Override
	public boolean hasBedType() {
		return bedTypeList != null && bedTypeList.size() > 0 && bedTypeList.get(0) != null;
	}

	public TYPE_OF_BED(String string) {
		this(new TEXT(string));
	}

	public TYPE_OF_BED(Text text) {
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

	public TYPE_OF_BED(List<BedType> bedTypeList,
			List<Text> textList) {
		setBedTypeList(bedTypeList);
		setTextList(textList);
	}

	public void copy(Container.TypeOfBed org) {
		setBedTypeList(org.getBedTypeList());
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
