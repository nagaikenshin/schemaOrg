package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.OfferItemCondition;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.Container.Name;

import org.seasar.doma.Transient;

public class ITEM_CONDITION implements Container.ItemCondition {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<OfferItemCondition> offerItemConditionList;

	public ITEM_CONDITION() {
	}

	public ITEM_CONDITION(String string) {
		this(new OFFER_ITEM_CONDITION(string));
	}

	public String getString() {
		if(offerItemConditionList == null || offerItemConditionList.size() == 0 || offerItemConditionList.get(0) == null) {
			return null;
		} else {
			Name name = offerItemConditionList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(offerItemConditionList == null) {
			offerItemConditionList = new ArrayList<OfferItemCondition>();
		}
		if(offerItemConditionList.size() == 0) {
			offerItemConditionList.add(new OFFER_ITEM_CONDITION(string));
		} else {
			offerItemConditionList.set(0, new OFFER_ITEM_CONDITION(string));
		}
	}

	public ITEM_CONDITION(OfferItemCondition offerItemCondition) {
		offerItemConditionList = new ArrayList<OfferItemCondition>();
		offerItemConditionList.add(offerItemCondition);
	}

	@Override
	public OfferItemCondition getOfferItemCondition() {
		if(offerItemConditionList != null && offerItemConditionList.size() > 0) {
			return offerItemConditionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOfferItemCondition(OfferItemCondition offerItemCondition) {
		if(offerItemConditionList == null) {
			offerItemConditionList = new ArrayList<>();
		}
		if(offerItemConditionList.size() == 0) {
			offerItemConditionList.add(offerItemCondition);
		} else {
			offerItemConditionList.set(0, offerItemCondition);
		}
	}

	@Override
	public List<OfferItemCondition> getOfferItemConditionList() {
		return offerItemConditionList;
	}

	@Override
	public void setOfferItemConditionList(List<OfferItemCondition> offerItemConditionList) {
		this.offerItemConditionList = offerItemConditionList;
	}

	@Override
	public boolean hasOfferItemCondition() {
		return offerItemConditionList != null && offerItemConditionList.size() > 0 && offerItemConditionList.get(0) != null;
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
