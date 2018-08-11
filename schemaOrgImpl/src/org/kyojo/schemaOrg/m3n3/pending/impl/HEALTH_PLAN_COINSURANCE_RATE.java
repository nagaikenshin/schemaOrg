package org.kyojo.schemaOrg.m3n3.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.DataType.Number;
import org.kyojo.schemaOrg.m3n3.core.impl.NUMBER;
import org.kyojo.schemaOrg.m3n3.pending.Container;

public class HEALTH_PLAN_COINSURANCE_RATE implements Container.HealthPlanCoinsuranceRate {

	private static final long serialVersionUID = 1L;

	public List<Number> numberList;

	public HEALTH_PLAN_COINSURANCE_RATE() {
	}

	public HEALTH_PLAN_COINSURANCE_RATE(java.math.BigDecimal number) {
		this(new NUMBER(number));
	}

	public HEALTH_PLAN_COINSURANCE_RATE(Number number) {
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
