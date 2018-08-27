package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.QuantitativeValue;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.DataType.Number;

import org.seasar.doma.Transient;

public class INTEREST_RATE implements Container.InterestRate {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<Number> numberList;
	@Transient
	public List<QuantitativeValue> quantitativeValueList;

	public INTEREST_RATE() {
	}

	public INTEREST_RATE(java.math.BigDecimal number) {
		this(new NUMBER(number));
	}

	public INTEREST_RATE(Number number) {
		numberList = new ArrayList<Number>();
		numberList.add(number);
	}

	@Override
	public Number getNumber() {
		if(numberList != null && numberList.size() > 0) {
			return numberList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setNumber(Number number) {
		if(numberList == null) {
			numberList = new ArrayList<>();
		}
		if(numberList.size() == 0) {
			numberList.add(number);
		} else {
			numberList.set(0, number);
		}
	}

	@Override
	public List<Number> getNumberList() {
		return numberList;
	}

	@Override
	public void setNumberList(List<Number> numberList) {
		this.numberList = numberList;
	}

	@Override
	public boolean hasNumber() {
		return numberList != null && numberList.size() > 0 && numberList.get(0) != null;
	}

	public INTEREST_RATE(QuantitativeValue quantitativeValue) {
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

	public INTEREST_RATE(List<Number> numberList,
			List<QuantitativeValue> quantitativeValueList) {
		setNumberList(numberList);
		setQuantitativeValueList(quantitativeValueList);
	}

	public void copy(Container.InterestRate org) {
		setNumberList(org.getNumberList());
		setQuantitativeValueList(org.getQuantitativeValueList());
	}

	@Override
	public java.math.BigDecimal getNativeValue() {
		if(getNumber() == null) return null;
		return getNumber().getNativeValue();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
