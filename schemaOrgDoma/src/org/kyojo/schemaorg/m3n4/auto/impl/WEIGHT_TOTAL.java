package org.kyojo.schemaorg.m3n4.auto.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.auto.Container;
import org.kyojo.schemaorg.m3n4.core.Clazz.QuantitativeValue;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.core.impl.QUANTITATIVE_VALUE;
import org.kyojo.schemaorg.m3n4.pending.Clazz.MonetaryAmountDistribution;
import org.kyojo.schemaorg.m3n4.pending.Clazz.QuantitativeValueDistribution;

import org.seasar.doma.Transient;

public class WEIGHT_TOTAL implements Container.WeightTotal {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<MonetaryAmountDistribution> monetaryAmountDistributionList;
	@Transient
	public List<QuantitativeValue> quantitativeValueList;
	@Transient
	public List<QuantitativeValueDistribution> quantitativeValueDistributionList;

	public WEIGHT_TOTAL() {
	}

	public WEIGHT_TOTAL(String string) {
		this(new QUANTITATIVE_VALUE(string));
	}

	public String getString() {
		if(quantitativeValueList == null || quantitativeValueList.size() == 0 || quantitativeValueList.get(0) == null) {
			return null;
		} else {
			Name name = quantitativeValueList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(quantitativeValueList == null) {
			quantitativeValueList = new ArrayList<QuantitativeValue>();
		}
		if(quantitativeValueList.size() == 0) {
			quantitativeValueList.add(new QUANTITATIVE_VALUE(string));
		} else {
			quantitativeValueList.set(0, new QUANTITATIVE_VALUE(string));
		}
	}

	public WEIGHT_TOTAL(MonetaryAmountDistribution monetaryAmountDistribution) {
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

	public WEIGHT_TOTAL(QuantitativeValue quantitativeValue) {
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

	public WEIGHT_TOTAL(QuantitativeValueDistribution quantitativeValueDistribution) {
		quantitativeValueDistributionList = new ArrayList<QuantitativeValueDistribution>();
		quantitativeValueDistributionList.add(quantitativeValueDistribution);
	}

	@Override
	public QuantitativeValueDistribution getQuantitativeValueDistribution() {
		if(quantitativeValueDistributionList != null && quantitativeValueDistributionList.size() > 0) {
			return quantitativeValueDistributionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setQuantitativeValueDistribution(QuantitativeValueDistribution quantitativeValueDistribution) {
		if(quantitativeValueDistributionList == null) {
			quantitativeValueDistributionList = new ArrayList<>();
		}
		if(quantitativeValueDistributionList.size() == 0) {
			quantitativeValueDistributionList.add(quantitativeValueDistribution);
		} else {
			quantitativeValueDistributionList.set(0, quantitativeValueDistribution);
		}
	}

	@Override
	public List<QuantitativeValueDistribution> getQuantitativeValueDistributionList() {
		return quantitativeValueDistributionList;
	}

	@Override
	public void setQuantitativeValueDistributionList(List<QuantitativeValueDistribution> quantitativeValueDistributionList) {
		this.quantitativeValueDistributionList = quantitativeValueDistributionList;
	}

	@Override
	public boolean hasQuantitativeValueDistribution() {
		return quantitativeValueDistributionList != null && quantitativeValueDistributionList.size() > 0 && quantitativeValueDistributionList.get(0) != null;
	}

	public WEIGHT_TOTAL(List<MonetaryAmountDistribution> monetaryAmountDistributionList,
			List<QuantitativeValue> quantitativeValueList,
			List<QuantitativeValueDistribution> quantitativeValueDistributionList) {
		setMonetaryAmountDistributionList(monetaryAmountDistributionList);
		setQuantitativeValueList(quantitativeValueList);
		setQuantitativeValueDistributionList(quantitativeValueDistributionList);
	}

	public void copy(Container.WeightTotal org) {
		setMonetaryAmountDistributionList(org.getMonetaryAmountDistributionList());
		setQuantitativeValueList(org.getQuantitativeValueList());
		setQuantitativeValueDistributionList(org.getQuantitativeValueDistributionList());
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
