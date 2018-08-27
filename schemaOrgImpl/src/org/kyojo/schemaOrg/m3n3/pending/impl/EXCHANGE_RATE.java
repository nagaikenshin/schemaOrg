package org.kyojo.schemaorg.m3n3.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz.UnitPriceSpecification;
import org.kyojo.schemaorg.m3n3.core.Container.Name;
import org.kyojo.schemaorg.m3n3.pending.Clazz.ExchangeRateSpecification;
import org.kyojo.schemaorg.m3n3.pending.Container;
import org.kyojo.schemaorg.m3n3.pending.impl.EXCHANGE_RATE_SPECIFICATION;

public class EXCHANGE_RATE implements Container.ExchangeRate {

	private static final long serialVersionUID = 1L;

	public List<ExchangeRateSpecification> exchangeRateSpecificationList;
	public List<UnitPriceSpecification> unitPriceSpecificationList;

	public EXCHANGE_RATE() {
	}

	public EXCHANGE_RATE(String string) {
		this(new EXCHANGE_RATE_SPECIFICATION(string));
	}

	public String getString() {
		if(exchangeRateSpecificationList == null || exchangeRateSpecificationList.size() == 0 || exchangeRateSpecificationList.get(0) == null) {
			return null;
		} else {
			Name name = exchangeRateSpecificationList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(exchangeRateSpecificationList == null) {
			exchangeRateSpecificationList = new ArrayList<ExchangeRateSpecification>();
		}
		if(exchangeRateSpecificationList.size() == 0) {
			exchangeRateSpecificationList.add(new EXCHANGE_RATE_SPECIFICATION(string));
		} else {
			exchangeRateSpecificationList.set(0, new EXCHANGE_RATE_SPECIFICATION(string));
		}
	}

	public EXCHANGE_RATE(ExchangeRateSpecification exchangeRateSpecification) {
		exchangeRateSpecificationList = new ArrayList<ExchangeRateSpecification>();
		exchangeRateSpecificationList.add(exchangeRateSpecification);
	}

	@Override
	public ExchangeRateSpecification getExchangeRateSpecification() {
		if(exchangeRateSpecificationList != null && exchangeRateSpecificationList.size() > 0) {
			return exchangeRateSpecificationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setExchangeRateSpecification(ExchangeRateSpecification exchangeRateSpecification) {
		if(exchangeRateSpecificationList == null) {
			exchangeRateSpecificationList = new ArrayList<>();
		}
		if(exchangeRateSpecificationList.size() == 0) {
			exchangeRateSpecificationList.add(exchangeRateSpecification);
		} else {
			exchangeRateSpecificationList.set(0, exchangeRateSpecification);
		}
	}

	@Override
	public List<ExchangeRateSpecification> getExchangeRateSpecificationList() {
		return exchangeRateSpecificationList;
	}

	@Override
	public void setExchangeRateSpecificationList(List<ExchangeRateSpecification> exchangeRateSpecificationList) {
		this.exchangeRateSpecificationList = exchangeRateSpecificationList;
	}

	@Override
	public boolean hasExchangeRateSpecification() {
		return exchangeRateSpecificationList != null && exchangeRateSpecificationList.size() > 0 && exchangeRateSpecificationList.get(0) != null;
	}

	public EXCHANGE_RATE(UnitPriceSpecification unitPriceSpecification) {
		unitPriceSpecificationList = new ArrayList<UnitPriceSpecification>();
		unitPriceSpecificationList.add(unitPriceSpecification);
	}

	@Override
	public UnitPriceSpecification getUnitPriceSpecification() {
		if(unitPriceSpecificationList != null && unitPriceSpecificationList.size() > 0) {
			return unitPriceSpecificationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setUnitPriceSpecification(UnitPriceSpecification unitPriceSpecification) {
		if(unitPriceSpecificationList == null) {
			unitPriceSpecificationList = new ArrayList<>();
		}
		if(unitPriceSpecificationList.size() == 0) {
			unitPriceSpecificationList.add(unitPriceSpecification);
		} else {
			unitPriceSpecificationList.set(0, unitPriceSpecification);
		}
	}

	@Override
	public List<UnitPriceSpecification> getUnitPriceSpecificationList() {
		return unitPriceSpecificationList;
	}

	@Override
	public void setUnitPriceSpecificationList(List<UnitPriceSpecification> unitPriceSpecificationList) {
		this.unitPriceSpecificationList = unitPriceSpecificationList;
	}

	@Override
	public boolean hasUnitPriceSpecification() {
		return unitPriceSpecificationList != null && unitPriceSpecificationList.size() > 0 && unitPriceSpecificationList.get(0) != null;
	}

	public EXCHANGE_RATE(List<ExchangeRateSpecification> exchangeRateSpecificationList,
			List<UnitPriceSpecification> unitPriceSpecificationList) {
		setExchangeRateSpecificationList(exchangeRateSpecificationList);
		setUnitPriceSpecificationList(unitPriceSpecificationList);
	}

	public void copy(Container.ExchangeRate org) {
		setExchangeRateSpecificationList(org.getExchangeRateSpecificationList());
		setUnitPriceSpecificationList(org.getUnitPriceSpecificationList());
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
