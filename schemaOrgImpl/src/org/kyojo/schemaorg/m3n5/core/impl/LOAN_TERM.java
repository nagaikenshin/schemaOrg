package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.Duration;
import org.kyojo.schemaorg.m3n5.core.Clazz.QuantitativeValue;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.Container.Name;

public class LOAN_TERM implements Container.LoanTerm {

	private static final long serialVersionUID = 1L;

	public List<Duration> durationList;
	public List<QuantitativeValue> quantitativeValueList;

	public LOAN_TERM() {
	}

	public LOAN_TERM(String string) {
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

	public LOAN_TERM(Duration duration) {
		durationList = new ArrayList<Duration>();
		durationList.add(duration);
	}

	@Override
	public Duration getDuration() {
		if(durationList != null && durationList.size() > 0) {
			return durationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDuration(Duration duration) {
		if(durationList == null) {
			durationList = new ArrayList<>();
		}
		if(durationList.size() == 0) {
			durationList.add(duration);
		} else {
			durationList.set(0, duration);
		}
	}

	@Override
	public List<Duration> getDurationList() {
		return durationList;
	}

	@Override
	public void setDurationList(List<Duration> durationList) {
		this.durationList = durationList;
	}

	@Override
	public boolean hasDuration() {
		return durationList != null && durationList.size() > 0 && durationList.get(0) != null;
	}

	public LOAN_TERM(QuantitativeValue quantitativeValue) {
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

	public LOAN_TERM(List<Duration> durationList,
			List<QuantitativeValue> quantitativeValueList) {
		setDurationList(durationList);
		setQuantitativeValueList(quantitativeValueList);
	}

	public void copy(Container.LoanTerm org) {
		setDurationList(org.getDurationList());
		setQuantitativeValueList(org.getQuantitativeValueList());
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
