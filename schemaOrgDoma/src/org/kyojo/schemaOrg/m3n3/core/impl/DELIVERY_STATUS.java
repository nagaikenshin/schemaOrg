package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.DeliveryEvent;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

import org.seasar.doma.Transient;

public class DELIVERY_STATUS implements Container.DeliveryStatus {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<DeliveryEvent> deliveryEventList;

	public DELIVERY_STATUS() {
	}

	public DELIVERY_STATUS(String string) {
		this(new DELIVERY_EVENT(string));
	}

	public String getString() {
		if(deliveryEventList == null || deliveryEventList.size() == 0 || deliveryEventList.get(0) == null) {
			return null;
		} else {
			Name name = deliveryEventList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(deliveryEventList == null) {
			deliveryEventList = new ArrayList<DeliveryEvent>();
		}
		if(deliveryEventList.size() == 0) {
			deliveryEventList.add(new DELIVERY_EVENT(string));
		} else {
			deliveryEventList.set(0, new DELIVERY_EVENT(string));
		}
	}

	public DELIVERY_STATUS(DeliveryEvent deliveryEvent) {
		deliveryEventList = new ArrayList<DeliveryEvent>();
		deliveryEventList.add(deliveryEvent);
	}

	@Override
	public DeliveryEvent getDeliveryEvent() {
		if(deliveryEventList != null && deliveryEventList.size() > 0) {
			return deliveryEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDeliveryEvent(DeliveryEvent deliveryEvent) {
		if(deliveryEventList == null) {
			deliveryEventList = new ArrayList<>();
		}
		if(deliveryEventList.size() == 0) {
			deliveryEventList.add(deliveryEvent);
		} else {
			deliveryEventList.set(0, deliveryEvent);
		}
	}

	@Override
	public List<DeliveryEvent> getDeliveryEventList() {
		return deliveryEventList;
	}

	@Override
	public void setDeliveryEventList(List<DeliveryEvent> deliveryEventList) {
		this.deliveryEventList = deliveryEventList;
	}

	@Override
	public boolean hasDeliveryEvent() {
		return deliveryEventList != null && deliveryEventList.size() > 0 && deliveryEventList.get(0) != null;
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
