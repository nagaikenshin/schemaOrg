package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.Offer;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

import org.seasar.doma.Transient;

public class ADD_ON implements Container.AddOn {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<Offer> offerList;

	public ADD_ON() {
	}

	public ADD_ON(String string) {
		this(new OFFER(string));
	}

	public String getString() {
		if(offerList == null || offerList.size() == 0 || offerList.get(0) == null) {
			return null;
		} else {
			Name name = offerList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(offerList == null) {
			offerList = new ArrayList<Offer>();
		}
		if(offerList.size() == 0) {
			offerList.add(new OFFER(string));
		} else {
			offerList.set(0, new OFFER(string));
		}
	}

	public ADD_ON(Offer offer) {
		offerList = new ArrayList<Offer>();
		offerList.add(offer);
	}

	@Override
	public Offer getOffer() {
		if(offerList != null && offerList.size() > 0) {
			return offerList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOffer(Offer offer) {
		if(offerList == null) {
			offerList = new ArrayList<>();
		}
		if(offerList.size() == 0) {
			offerList.add(offer);
		} else {
			offerList.set(0, offer);
		}
	}

	@Override
	public List<Offer> getOfferList() {
		return offerList;
	}

	@Override
	public void setOfferList(List<Offer> offerList) {
		this.offerList = offerList;
	}

	@Override
	public boolean hasOffer() {
		return offerList != null && offerList.size() > 0 && offerList.get(0) != null;
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
