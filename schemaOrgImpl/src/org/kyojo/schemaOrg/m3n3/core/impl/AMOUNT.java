package org.kyojo.schemaorg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz.MonetaryAmount;
import org.kyojo.schemaorg.m3n3.core.Container;
import org.kyojo.schemaorg.m3n3.core.DataType.Number;

public class AMOUNT implements Container.Amount {

	private static final long serialVersionUID = 1L;

	public List<MonetaryAmount> monetaryAmountList;
	public List<Number> numberList;

	public AMOUNT() {
	}

	public AMOUNT(MonetaryAmount monetaryAmount) {
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

	public AMOUNT(java.math.BigDecimal number) {
		this(new NUMBER(number));
	}

	public AMOUNT(Number number) {
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

	public AMOUNT(List<MonetaryAmount> monetaryAmountList,
			List<Number> numberList) {
		setMonetaryAmountList(monetaryAmountList);
		setNumberList(numberList);
	}

	public void copy(Container.Amount org) {
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
