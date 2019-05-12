package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.Float;
import org.kyojo.schemaorg.m3n5.core.Clazz.Integer;
import org.kyojo.schemaorg.m3n5.core.Clazz.QuantitativeValue;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.DataType.Number;

import org.seasar.doma.Transient;

public class BROADCAST_FREQUENCY_VALUE implements Container.BroadcastFrequencyValue {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<Float> fl0atList;
	@Transient
	public List<Integer> integerList;
	@Transient
	public List<Number> numberList;
	@Transient
	public List<QuantitativeValue> quantitativeValueList;

	public BROADCAST_FREQUENCY_VALUE() {
	}

	public BROADCAST_FREQUENCY_VALUE(Double d0uble) {
		this(new FLOAT(d0uble));
	}

	public BROADCAST_FREQUENCY_VALUE(Float fl0at) {
		fl0atList = new ArrayList<Float>();
		fl0atList.add(fl0at);
	}

	@Override
	public Float getFl0at() {
		if(fl0atList != null && fl0atList.size() > 0) {
			return fl0atList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setFl0at(Float fl0at) {
		if(fl0atList == null) {
			fl0atList = new ArrayList<>();
		}
		if(fl0atList.size() == 0) {
			fl0atList.add(fl0at);
		} else {
			fl0atList.set(0, fl0at);
		}
	}

	@Override
	public List<Float> getFl0atList() {
		return fl0atList;
	}

	@Override
	public void setFl0atList(List<Float> fl0atList) {
		this.fl0atList = fl0atList;
	}

	@Override
	public boolean hasFl0at() {
		return fl0atList != null && fl0atList.size() > 0 && fl0atList.get(0) != null;
	}

	public BROADCAST_FREQUENCY_VALUE(Long l0ng) {
		this(new INTEGER(l0ng));
	}

	public BROADCAST_FREQUENCY_VALUE(Integer integer) {
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

	public BROADCAST_FREQUENCY_VALUE(java.math.BigDecimal number) {
		this(new NUMBER(number));
	}

	public BROADCAST_FREQUENCY_VALUE(Number number) {
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

	public BROADCAST_FREQUENCY_VALUE(QuantitativeValue quantitativeValue) {
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

	public BROADCAST_FREQUENCY_VALUE(List<Float> fl0atList,
			List<Integer> integerList,
			List<Number> numberList,
			List<QuantitativeValue> quantitativeValueList) {
		setFl0atList(fl0atList);
		setIntegerList(integerList);
		setNumberList(numberList);
		setQuantitativeValueList(quantitativeValueList);
	}

	public void copy(Container.BroadcastFrequencyValue org) {
		setFl0atList(org.getFl0atList());
		setIntegerList(org.getIntegerList());
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
