package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.MonetaryAmountDistribution;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.Container.Name;

public class ESTIMATED_SALARY implements Container.EstimatedSalary {

	private static final long serialVersionUID = 1L;

	public List<MonetaryAmountDistribution> monetaryAmountDistributionList;

	public ESTIMATED_SALARY() {
	}

	public ESTIMATED_SALARY(String string) {
		this(new MONETARY_AMOUNT_DISTRIBUTION(string));
	}

	public String getString() {
		if(monetaryAmountDistributionList == null || monetaryAmountDistributionList.size() == 0 || monetaryAmountDistributionList.get(0) == null) {
			return null;
		} else {
			Name name = monetaryAmountDistributionList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(monetaryAmountDistributionList == null) {
			monetaryAmountDistributionList = new ArrayList<MonetaryAmountDistribution>();
		}
		if(monetaryAmountDistributionList.size() == 0) {
			monetaryAmountDistributionList.add(new MONETARY_AMOUNT_DISTRIBUTION(string));
		} else {
			monetaryAmountDistributionList.set(0, new MONETARY_AMOUNT_DISTRIBUTION(string));
		}
	}

	public ESTIMATED_SALARY(MonetaryAmountDistribution monetaryAmountDistribution) {
		monetaryAmountDistributionList = new ArrayList<MonetaryAmountDistribution>();
		monetaryAmountDistributionList.add(monetaryAmountDistribution);
	}

	@Override
	public MonetaryAmountDistribution getMonetaryAmountDistribution() {
		if(monetaryAmountDistributionList != null && monetaryAmountDistributionList.size() > 0) {
			return monetaryAmountDistributionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMonetaryAmountDistribution(MonetaryAmountDistribution monetaryAmountDistribution) {
		if(monetaryAmountDistributionList == null) {
			monetaryAmountDistributionList = new ArrayList<>();
		}
		if(monetaryAmountDistributionList.size() == 0) {
			monetaryAmountDistributionList.add(monetaryAmountDistribution);
		} else {
			monetaryAmountDistributionList.set(0, monetaryAmountDistribution);
		}
	}

	@Override
	public List<MonetaryAmountDistribution> getMonetaryAmountDistributionList() {
		return monetaryAmountDistributionList;
	}

	@Override
	public void setMonetaryAmountDistributionList(List<MonetaryAmountDistribution> monetaryAmountDistributionList) {
		this.monetaryAmountDistributionList = monetaryAmountDistributionList;
	}

	@Override
	public boolean hasMonetaryAmountDistribution() {
		return monetaryAmountDistributionList != null && monetaryAmountDistributionList.size() > 0 && monetaryAmountDistributionList.get(0) != null;
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
