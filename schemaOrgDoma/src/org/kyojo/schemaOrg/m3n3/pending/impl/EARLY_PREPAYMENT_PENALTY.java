package org.kyojo.schemaOrg.m3n3.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.MonetaryAmount;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.core.impl.MONETARY_AMOUNT;
import org.kyojo.schemaOrg.m3n3.pending.Container;

import org.seasar.doma.Transient;

public class EARLY_PREPAYMENT_PENALTY implements Container.EarlyPrepaymentPenalty {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<MonetaryAmount> monetaryAmountList;

	public EARLY_PREPAYMENT_PENALTY() {
	}

	public EARLY_PREPAYMENT_PENALTY(String string) {
		this(new MONETARY_AMOUNT(string));
	}

	public String getString() {
		if(monetaryAmountList == null || monetaryAmountList.size() == 0 || monetaryAmountList.get(0) == null) {
			return null;
		} else {
			Name name = monetaryAmountList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(monetaryAmountList == null) {
			monetaryAmountList = new ArrayList<MonetaryAmount>();
		}
		if(monetaryAmountList.size() == 0) {
			monetaryAmountList.add(new MONETARY_AMOUNT(string));
		} else {
			monetaryAmountList.set(0, new MONETARY_AMOUNT(string));
		}
	}

	public EARLY_PREPAYMENT_PENALTY(MonetaryAmount monetaryAmount) {
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

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
