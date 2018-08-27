package org.kyojo.schemaorg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz.OfferCatalog;
import org.kyojo.schemaorg.m3n3.core.Container;
import org.kyojo.schemaorg.m3n3.core.Container.Name;

public class HAS_OFFER_CATALOG implements Container.HasOfferCatalog {

	private static final long serialVersionUID = 1L;

	public List<OfferCatalog> offerCatalogList;

	public HAS_OFFER_CATALOG() {
	}

	public HAS_OFFER_CATALOG(String string) {
		this(new OFFER_CATALOG(string));
	}

	public String getString() {
		if(offerCatalogList == null || offerCatalogList.size() == 0 || offerCatalogList.get(0) == null) {
			return null;
		} else {
			Name name = offerCatalogList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(offerCatalogList == null) {
			offerCatalogList = new ArrayList<OfferCatalog>();
		}
		if(offerCatalogList.size() == 0) {
			offerCatalogList.add(new OFFER_CATALOG(string));
		} else {
			offerCatalogList.set(0, new OFFER_CATALOG(string));
		}
	}

	public HAS_OFFER_CATALOG(OfferCatalog offerCatalog) {
		offerCatalogList = new ArrayList<OfferCatalog>();
		offerCatalogList.add(offerCatalog);
	}

	@Override
	public OfferCatalog getOfferCatalog() {
		if(offerCatalogList != null && offerCatalogList.size() > 0) {
			return offerCatalogList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOfferCatalog(OfferCatalog offerCatalog) {
		if(offerCatalogList == null) {
			offerCatalogList = new ArrayList<>();
		}
		if(offerCatalogList.size() == 0) {
			offerCatalogList.add(offerCatalog);
		} else {
			offerCatalogList.set(0, offerCatalog);
		}
	}

	@Override
	public List<OfferCatalog> getOfferCatalogList() {
		return offerCatalogList;
	}

	@Override
	public void setOfferCatalogList(List<OfferCatalog> offerCatalogList) {
		this.offerCatalogList = offerCatalogList;
	}

	@Override
	public boolean hasOfferCatalog() {
		return offerCatalogList != null && offerCatalogList.size() > 0 && offerCatalogList.get(0) != null;
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
