package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.QualitativeValue;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.DataType.Text;

public class LODGING_UNIT_TYPE implements Container.LodgingUnitType {

	private static final long serialVersionUID = 1L;

	public List<QualitativeValue> qualitativeValueList;
	public List<Text> textList;

	public LODGING_UNIT_TYPE() {
	}

	public LODGING_UNIT_TYPE(QualitativeValue qualitativeValue) {
		qualitativeValueList = new ArrayList<QualitativeValue>();
		qualitativeValueList.add(qualitativeValue);
	}

	@Override
	public QualitativeValue getQualitativeValue() {
		if(qualitativeValueList != null && qualitativeValueList.size() > 0) {
			return qualitativeValueList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setQualitativeValue(QualitativeValue qualitativeValue) {
		if(qualitativeValueList == null) {
			qualitativeValueList = new ArrayList<>();
		}
		if(qualitativeValueList.size() == 0) {
			qualitativeValueList.add(qualitativeValue);
		} else {
			qualitativeValueList.set(0, qualitativeValue);
		}
	}

	@Override
	public List<QualitativeValue> getQualitativeValueList() {
		return qualitativeValueList;
	}

	@Override
	public void setQualitativeValueList(List<QualitativeValue> qualitativeValueList) {
		this.qualitativeValueList = qualitativeValueList;
	}

	@Override
	public boolean hasQualitativeValue() {
		return qualitativeValueList != null && qualitativeValueList.size() > 0 && qualitativeValueList.get(0) != null;
	}

	public LODGING_UNIT_TYPE(String string) {
		this(new TEXT(string));
	}

	public LODGING_UNIT_TYPE(Text text) {
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

	public LODGING_UNIT_TYPE(List<QualitativeValue> qualitativeValueList,
			List<Text> textList) {
		setQualitativeValueList(qualitativeValueList);
		setTextList(textList);
	}

	public void copy(Container.LodgingUnitType org) {
		setQualitativeValueList(org.getQualitativeValueList());
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
