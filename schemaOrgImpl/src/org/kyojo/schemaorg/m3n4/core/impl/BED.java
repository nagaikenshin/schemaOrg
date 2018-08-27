package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.BedDetails;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.DataType.Text;
import org.kyojo.schemaorg.m3n4.pending.Clazz.BedType;

public class BED implements Container.Bed {

	private static final long serialVersionUID = 1L;

	public List<BedDetails> bedDetailsList;
	public List<BedType> bedTypeList;
	public List<Text> textList;

	public BED() {
	}

	public BED(BedDetails bedDetails) {
		bedDetailsList = new ArrayList<BedDetails>();
		bedDetailsList.add(bedDetails);
	}

	@Override
	public BedDetails getBedDetails() {
		if(bedDetailsList != null && bedDetailsList.size() > 0) {
			return bedDetailsList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBedDetails(BedDetails bedDetails) {
		if(bedDetailsList == null) {
			bedDetailsList = new ArrayList<>();
		}
		if(bedDetailsList.size() == 0) {
			bedDetailsList.add(bedDetails);
		} else {
			bedDetailsList.set(0, bedDetails);
		}
	}

	@Override
	public List<BedDetails> getBedDetailsList() {
		return bedDetailsList;
	}

	@Override
	public void setBedDetailsList(List<BedDetails> bedDetailsList) {
		this.bedDetailsList = bedDetailsList;
	}

	@Override
	public boolean hasBedDetails() {
		return bedDetailsList != null && bedDetailsList.size() > 0 && bedDetailsList.get(0) != null;
	}

	public BED(BedType bedType) {
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

	public BED(String string) {
		this(new TEXT(string));
	}

	public BED(Text text) {
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

	public BED(List<BedDetails> bedDetailsList,
			List<BedType> bedTypeList,
			List<Text> textList) {
		setBedDetailsList(bedDetailsList);
		setBedTypeList(bedTypeList);
		setTextList(textList);
	}

	public void copy(Container.Bed org) {
		setBedDetailsList(org.getBedDetailsList());
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
