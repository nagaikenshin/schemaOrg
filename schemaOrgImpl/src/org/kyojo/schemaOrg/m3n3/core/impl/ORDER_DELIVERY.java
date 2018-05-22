package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ParcelDelivery;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

public class ORDER_DELIVERY implements Container.OrderDelivery {

	private static final long serialVersionUID = 1L;

	public List<ParcelDelivery> parcelDeliveryList;

	public ORDER_DELIVERY() {
	}

	public ORDER_DELIVERY(String string) {
		this(new PARCEL_DELIVERY(string));
	}

	public String getString() {
		if(parcelDeliveryList == null || parcelDeliveryList.size() == 0 || parcelDeliveryList.get(0) == null) {
			return null;
		} else {
			Name name = parcelDeliveryList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(parcelDeliveryList == null) {
			parcelDeliveryList = new ArrayList<ParcelDelivery>();
		}
		if(parcelDeliveryList.size() == 0) {
			parcelDeliveryList.add(new PARCEL_DELIVERY(string));
		} else {
			parcelDeliveryList.set(0, new PARCEL_DELIVERY(string));
		}
	}

	public ORDER_DELIVERY(ParcelDelivery parcelDelivery) {
		parcelDeliveryList = new ArrayList<ParcelDelivery>();
		parcelDeliveryList.add(parcelDelivery);
	}

	@Override
	public ParcelDelivery getParcelDelivery() {
		if(parcelDeliveryList != null && parcelDeliveryList.size() > 0) {
			return parcelDeliveryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setParcelDelivery(ParcelDelivery parcelDelivery) {
		if(parcelDeliveryList == null) {
			parcelDeliveryList = new ArrayList<>();
		}
		if(parcelDeliveryList.size() == 0) {
			parcelDeliveryList.add(parcelDelivery);
		} else {
			parcelDeliveryList.set(0, parcelDelivery);
		}
	}

	@Override
	public List<ParcelDelivery> getParcelDeliveryList() {
		return parcelDeliveryList;
	}

	@Override
	public void setParcelDeliveryList(List<ParcelDelivery> parcelDeliveryList) {
		this.parcelDeliveryList = parcelDeliveryList;
	}

	@Override
	public boolean hasParcelDelivery() {
		return parcelDeliveryList != null && parcelDeliveryList.size() > 0 && parcelDeliveryList.get(0) != null;
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
