package org.kyojo.schemaorg.m3n4.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.Float;
import org.kyojo.schemaorg.m3n4.core.Clazz.Integer;
import org.kyojo.schemaorg.m3n4.core.Clazz.MonetaryAmount;
import org.kyojo.schemaorg.m3n4.core.DataType.Number;
import org.kyojo.schemaorg.m3n4.core.impl.FLOAT;
import org.kyojo.schemaorg.m3n4.core.impl.INTEGER;
import org.kyojo.schemaorg.m3n4.core.impl.NUMBER;
import org.kyojo.schemaorg.m3n4.pending.Container;

public class EXCHANGE_RATE_SPREAD implements Container.ExchangeRateSpread {

	private static final long serialVersionUID = 1L;

	public List<Float> fl0atList;
	public List<Integer> integerList;
	public List<MonetaryAmount> monetaryAmountList;
	public List<Number> numberList;

	public EXCHANGE_RATE_SPREAD() {
	}

	public EXCHANGE_RATE_SPREAD(Double d0uble) {
		this(new FLOAT(d0uble));
	}

	public EXCHANGE_RATE_SPREAD(Float fl0at) {
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

	public EXCHANGE_RATE_SPREAD(Long l0ng) {
		this(new INTEGER(l0ng));
	}

	public EXCHANGE_RATE_SPREAD(Integer integer) {
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

	public EXCHANGE_RATE_SPREAD(MonetaryAmount monetaryAmount) {
		monetaryAmountList = new ArrayList<MonetaryAmount>();
		monetaryAmountList.add(monetaryAmount);
	}

	@Override
	public MonetaryAmount getMonetaryAmount() {
		if(monetaryAmountList != null && monetaryAmountList.size() > 0) {
			return monetaryAmountList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMonetaryAmount(MonetaryAmount monetaryAmount) {
		if(monetaryAmountList == null) {
			monetaryAmountList = new ArrayList<>();
		}
		if(monetaryAmountList.size() == 0) {
			monetaryAmountList.add(monetaryAmount);
		} else {
			monetaryAmountList.set(0, monetaryAmount);
		}
	}

	@Override
	public List<MonetaryAmount> getMonetaryAmountList() {
		return monetaryAmountList;
	}

	@Override
	public void setMonetaryAmountList(List<MonetaryAmount> monetaryAmountList) {
		this.monetaryAmountList = monetaryAmountList;
	}

	@Override
	public boolean hasMonetaryAmount() {
		return monetaryAmountList != null && monetaryAmountList.size() > 0 && monetaryAmountList.get(0) != null;
	}

	public EXCHANGE_RATE_SPREAD(java.math.BigDecimal number) {
		this(new NUMBER(number));
	}

	public EXCHANGE_RATE_SPREAD(Number number) {
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

	public EXCHANGE_RATE_SPREAD(List<Float> fl0atList,
			List<Integer> integerList,
			List<MonetaryAmount> monetaryAmountList,
			List<Number> numberList) {
		setFl0atList(fl0atList);
		setIntegerList(integerList);
		setMonetaryAmountList(monetaryAmountList);
		setNumberList(numberList);
	}

	public void copy(Container.ExchangeRateSpread org) {
		setFl0atList(org.getFl0atList());
		setIntegerList(org.getIntegerList());
		setMonetaryAmountList(org.getMonetaryAmountList());
		setNumberList(org.getNumberList());
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
