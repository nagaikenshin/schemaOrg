package org.kyojo.schemaorg.m3n3.auto.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.auto.Container;
import org.kyojo.schemaorg.m3n3.core.Clazz.QuantitativeValue;
import org.kyojo.schemaorg.m3n3.core.Container.Name;
import org.kyojo.schemaorg.m3n3.core.impl.QUANTITATIVE_VALUE;

public class TRAILER_WEIGHT implements Container.TrailerWeight {

	private static final long serialVersionUID = 1L;

	public List<QuantitativeValue> quantitativeValueList;

	public TRAILER_WEIGHT() {
	}

	public TRAILER_WEIGHT(String string) {
		this(new QUANTITATIVE_VALUE(string));
	}

	public String getString() {
		if(quantitativeValueList == null || quantitativeValueList.size() == 0 || quantitativeValueList.get(0) == null) {
			return null;
		} else {
			Name name = quantitativeValueList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(quantitativeValueList == null) {
			quantitativeValueList = new ArrayList<QuantitativeValue>();
		}
		if(quantitativeValueList.size() == 0) {
			quantitativeValueList.add(new QUANTITATIVE_VALUE(string));
		} else {
			quantitativeValueList.set(0, new QUANTITATIVE_VALUE(string));
		}
	}

	public TRAILER_WEIGHT(QuantitativeValue quantitativeValue) {
		quantitativeValueList = new ArrayList<QuantitativeValue>();
		quantitativeValueList.add(quantitativeValue);
	}

	@Override
	public QuantitativeValue getQuantitativeValue() {
		if(quantitativeValueList != null && quantitativeValueList.size() > 0) {
			return quantitativeValueList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setQuantitativeValue(QuantitativeValue quantitativeValue) {
		if(quantitativeValueList == null) {
			quantitativeValueList = new ArrayList<>();
		}
		if(quantitativeValueList.size() == 0) {
			quantitativeValueList.add(quantitativeValue);
		} else {
			quantitativeValueList.set(0, quantitativeValue);
		}
	}

	@Override
	public List<QuantitativeValue> getQuantitativeValueList() {
		return quantitativeValueList;
	}

	@Override
	public void setQuantitativeValueList(List<QuantitativeValue> quantitativeValueList) {
		this.quantitativeValueList = quantitativeValueList;
	}

	@Override
	public boolean hasQuantitativeValue() {
		return quantitativeValueList != null && quantitativeValueList.size() > 0 && quantitativeValueList.get(0) != null;
	}

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
