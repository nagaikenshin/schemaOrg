package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.Integer;
import org.kyojo.schemaorg.m3n4.core.Clazz.QuantitativeValue;
import org.kyojo.schemaorg.m3n4.core.Container;

import org.seasar.doma.Transient;

public class PARTY_SIZE implements Container.PartySize {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<Integer> integerList;
	@Transient
	public List<QuantitativeValue> quantitativeValueList;

	public PARTY_SIZE() {
	}

	public PARTY_SIZE(Long l0ng) {
		this(new INTEGER(l0ng));
	}

	public PARTY_SIZE(Integer integer) {
		integerList = new ArrayList<Integer>();
		integerList.add(integer);
	}

	@Override
	public Integer getInteger() {
		if(integerList != null && integerList.size() > 0) {
			return integerList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setInteger(Integer integer) {
		if(integerList == null) {
			integerList = new ArrayList<>();
		}
		if(integerList.size() == 0) {
			integerList.add(integer);
		} else {
			integerList.set(0, integer);
		}
	}

	@Override
	public List<Integer> getIntegerList() {
		return integerList;
	}

	@Override
	public void setIntegerList(List<Integer> integerList) {
		this.integerList = integerList;
	}

	@Override
	public boolean hasInteger() {
		return integerList != null && integerList.size() > 0 && integerList.get(0) != null;
	}

	public PARTY_SIZE(QuantitativeValue quantitativeValue) {
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

	public PARTY_SIZE(List<Integer> integerList,
			List<QuantitativeValue> quantitativeValueList) {
		setIntegerList(integerList);
		setQuantitativeValueList(quantitativeValueList);
	}

	public void copy(Container.PartySize org) {
		setIntegerList(org.getIntegerList());
		setQuantitativeValueList(org.getQuantitativeValueList());
	}

	@Override
	public Long getNativeValue() {
		if(getInteger() == null) return null;
		return getInteger().getNativeValue();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
