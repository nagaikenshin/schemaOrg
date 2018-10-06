package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.QuantitativeValue;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.DataType.Text;
import org.kyojo.schemaorg.m3n4.pending.Clazz.MonetaryAmountDistribution;
import org.kyojo.schemaorg.m3n4.pending.Clazz.QuantitativeValueDistribution;

import org.seasar.doma.Transient;

public class RECIPE_YIELD implements Container.RecipeYield {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<MonetaryAmountDistribution> monetaryAmountDistributionList;
	@Transient
	public List<QuantitativeValue> quantitativeValueList;
	@Transient
	public List<QuantitativeValueDistribution> quantitativeValueDistributionList;
	@Transient
	public List<Text> textList;

	public RECIPE_YIELD() {
	}

	public RECIPE_YIELD(MonetaryAmountDistribution monetaryAmountDistribution) {
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

	public RECIPE_YIELD(QuantitativeValue quantitativeValue) {
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

	public RECIPE_YIELD(QuantitativeValueDistribution quantitativeValueDistribution) {
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

	public RECIPE_YIELD(String string) {
		this(new TEXT(string));
	}

	public RECIPE_YIELD(Text text) {
		textList = new ArrayList<Text>();
		textList.add(text);
	}

	@Override
	public Text getText() {
		if(textList != null && textList.size() > 0) {
			return textList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setText(Text text) {
		if(textList == null) {
			textList = new ArrayList<>();
		}
		if(textList.size() == 0) {
			textList.add(text);
		} else {
			textList.set(0, text);
		}
	}

	@Override
	public List<Text> getTextList() {
		return textList;
	}

	@Override
	public void setTextList(List<Text> textList) {
		this.textList = textList;
	}

	@Override
	public boolean hasText() {
		return textList != null && textList.size() > 0 && textList.get(0) != null;
	}

	public RECIPE_YIELD(List<MonetaryAmountDistribution> monetaryAmountDistributionList,
			List<QuantitativeValue> quantitativeValueList,
			List<QuantitativeValueDistribution> quantitativeValueDistributionList,
			List<Text> textList) {
		setMonetaryAmountDistributionList(monetaryAmountDistributionList);
		setQuantitativeValueList(quantitativeValueList);
		setQuantitativeValueDistributionList(quantitativeValueDistributionList);
		setTextList(textList);
	}

	public void copy(Container.RecipeYield org) {
		setMonetaryAmountDistributionList(org.getMonetaryAmountDistributionList());
		setQuantitativeValueList(org.getQuantitativeValueList());
		setQuantitativeValueDistributionList(org.getQuantitativeValueDistributionList());
		setTextList(org.getTextList());
	}

	@Override
	public String getNativeValue() {
		if(getText() == null) return null;
		return getText().getNativeValue();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
