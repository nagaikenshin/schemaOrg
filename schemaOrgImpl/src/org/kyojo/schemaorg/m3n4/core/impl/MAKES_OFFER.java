package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.AggregateOffer;
import org.kyojo.schemaorg.m3n4.core.Clazz.Offer;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

public class MAKES_OFFER implements Container.MakesOffer {

	private static final long serialVersionUID = 1L;

	public List<AggregateOffer> aggregateOfferList;
	public List<Offer> offerList;

	public MAKES_OFFER() {
	}

	public MAKES_OFFER(String string) {
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

	public MAKES_OFFER(AggregateOffer aggregateOffer) {
		aggregateOfferList = new ArrayList<AggregateOffer>();
		aggregateOfferList.add(aggregateOffer);
	}

	@Override
	public AggregateOffer getAggregateOffer() {
		if(aggregateOfferList != null && aggregateOfferList.size() > 0) {
			return aggregateOfferList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAggregateOffer(AggregateOffer aggregateOffer) {
		if(aggregateOfferList == null) {
			aggregateOfferList = new ArrayList<>();
		}
		if(aggregateOfferList.size() == 0) {
			aggregateOfferList.add(aggregateOffer);
		} else {
			aggregateOfferList.set(0, aggregateOffer);
		}
	}

	@Override
	public List<AggregateOffer> getAggregateOfferList() {
		return aggregateOfferList;
	}

	@Override
	public void setAggregateOfferList(List<AggregateOffer> aggregateOfferList) {
		this.aggregateOfferList = aggregateOfferList;
	}

	@Override
	public boolean hasAggregateOffer() {
		return aggregateOfferList != null && aggregateOfferList.size() > 0 && aggregateOfferList.get(0) != null;
	}

	public MAKES_OFFER(Offer offer) {
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

	public MAKES_OFFER(List<AggregateOffer> aggregateOfferList,
			List<Offer> offerList) {
		setAggregateOfferList(aggregateOfferList);
		setOfferList(offerList);
	}

	public void copy(Container.MakesOffer org) {
		setAggregateOfferList(org.getAggregateOfferList());
		setOfferList(org.getOfferList());
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
