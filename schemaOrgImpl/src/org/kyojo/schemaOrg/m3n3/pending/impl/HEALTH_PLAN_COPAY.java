package org.kyojo.schemaorg.m3n3.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz.PriceSpecification;
import org.kyojo.schemaorg.m3n3.core.Container.Name;
import org.kyojo.schemaorg.m3n3.core.impl.PRICE_SPECIFICATION;
import org.kyojo.schemaorg.m3n3.pending.Container;

public class HEALTH_PLAN_COPAY implements Container.HealthPlanCopay {

	private static final long serialVersionUID = 1L;

	public List<PriceSpecification> priceSpecificationList;

	public HEALTH_PLAN_COPAY() {
	}

	public HEALTH_PLAN_COPAY(String string) {
		this(new PRICE_SPECIFICATION(string));
	}

	public String getString() {
		if(priceSpecificationList == null || priceSpecificationList.size() == 0 || priceSpecificationList.get(0) == null) {
			return null;
		} else {
			Name name = priceSpecificationList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(priceSpecificationList == null) {
			priceSpecificationList = new ArrayList<PriceSpecification>();
		}
		if(priceSpecificationList.size() == 0) {
			priceSpecificationList.add(new PRICE_SPECIFICATION(string));
		} else {
			priceSpecificationList.set(0, new PRICE_SPECIFICATION(string));
		}
	}

	public HEALTH_PLAN_COPAY(PriceSpecification priceSpecification) {
		priceSpecificationList = new ArrayList<PriceSpecification>();
		priceSpecificationList.add(priceSpecification);
	}

	@Override
	public PriceSpecification getPriceSpecification() {
		if(priceSpecificationList != null && priceSpecificationList.size() > 0) {
			return priceSpecificationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPriceSpecification(PriceSpecification priceSpecification) {
		if(priceSpecificationList == null) {
			priceSpecificationList = new ArrayList<>();
		}
		if(priceSpecificationList.size() == 0) {
			priceSpecificationList.add(priceSpecification);
		} else {
			priceSpecificationList.set(0, priceSpecification);
		}
	}

	@Override
	public List<PriceSpecification> getPriceSpecificationList() {
		return priceSpecificationList;
	}

	@Override
	public void setPriceSpecificationList(List<PriceSpecification> priceSpecificationList) {
		this.priceSpecificationList = priceSpecificationList;
	}

	@Override
	public boolean hasPriceSpecification() {
		return priceSpecificationList != null && priceSpecificationList.size() > 0 && priceSpecificationList.get(0) != null;
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
