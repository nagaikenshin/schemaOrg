package org.kyojo.schemaorg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz.UnitPriceSpecification;
import org.kyojo.schemaorg.m3n3.core.Container;
import org.kyojo.schemaorg.m3n3.core.Container.Name;

public class PRICE_COMPONENT implements Container.PriceComponent {

	private static final long serialVersionUID = 1L;

	public List<UnitPriceSpecification> unitPriceSpecificationList;

	public PRICE_COMPONENT() {
	}

	public PRICE_COMPONENT(String string) {
		this(new UNIT_PRICE_SPECIFICATION(string));
	}

	public String getString() {
		if(unitPriceSpecificationList == null || unitPriceSpecificationList.size() == 0 || unitPriceSpecificationList.get(0) == null) {
			return null;
		} else {
			Name name = unitPriceSpecificationList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(unitPriceSpecificationList == null) {
			unitPriceSpecificationList = new ArrayList<UnitPriceSpecification>();
		}
		if(unitPriceSpecificationList.size() == 0) {
			unitPriceSpecificationList.add(new UNIT_PRICE_SPECIFICATION(string));
		} else {
			unitPriceSpecificationList.set(0, new UNIT_PRICE_SPECIFICATION(string));
		}
	}

	public PRICE_COMPONENT(UnitPriceSpecification unitPriceSpecification) {
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

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
