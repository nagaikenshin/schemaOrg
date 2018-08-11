package org.kyojo.schemaOrg.m3n3.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.DataType.Boolean;
import org.kyojo.schemaOrg.m3n3.core.DataType.Number;
import org.kyojo.schemaOrg.m3n3.core.impl.BOOLEAN;
import org.kyojo.schemaOrg.m3n3.core.impl.NUMBER;
import org.kyojo.schemaOrg.m3n3.pending.Container;

public class CASH_BACK implements Container.CashBack {

	private static final long serialVersionUID = 1L;

	public List<Boolean> b00leanList;
	public List<Number> numberList;

	public CASH_BACK() {
	}

	public CASH_BACK(java.lang.Boolean b00lean) {
		this(new BOOLEAN(b00lean));
	}

	public CASH_BACK(Boolean b00lean) {
		b00leanList = new ArrayList<Boolean>();
		b00leanList.add(b00lean);
	}

	@Override
	public Boolean getB00lean() {
		if(b00leanList != null && b00leanList.size() > 0) {
			return b00leanList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setB00lean(Boolean b00lean) {
		if(b00leanList == null) {
			b00leanList = new ArrayList<>();
		}
		if(b00leanList.size() == 0) {
			b00leanList.add(b00lean);
		} else {
			b00leanList.set(0, b00lean);
		}
	}

	@Override
	public List<Boolean> getB00leanList() {
		return b00leanList;
	}

	@Override
	public void setB00leanList(List<Boolean> b00leanList) {
		this.b00leanList = b00leanList;
	}

	@Override
	public boolean hasB00lean() {
		return b00leanList != null && b00leanList.size() > 0 && b00leanList.get(0) != null;
	}

	public CASH_BACK(java.math.BigDecimal number) {
		this(new NUMBER(number));
	}

	public CASH_BACK(Number number) {
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

	public CASH_BACK(List<Boolean> b00leanList,
			List<Number> numberList) {
		setB00leanList(b00leanList);
		setNumberList(numberList);
	}

	public void copy(Container.CashBack org) {
		setB00leanList(org.getB00leanList());
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
