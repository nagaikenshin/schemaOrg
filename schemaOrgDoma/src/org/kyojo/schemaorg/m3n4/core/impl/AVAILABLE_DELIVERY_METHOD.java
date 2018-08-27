package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.DeliveryMethod;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

import org.seasar.doma.Transient;

public class AVAILABLE_DELIVERY_METHOD implements Container.AvailableDeliveryMethod {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<DeliveryMethod> deliveryMethodList;

	public AVAILABLE_DELIVERY_METHOD() {
	}

	public AVAILABLE_DELIVERY_METHOD(String string) {
		this(new DELIVERY_METHOD(string));
	}

	public String getString() {
		if(deliveryMethodList == null || deliveryMethodList.size() == 0 || deliveryMethodList.get(0) == null) {
			return null;
		} else {
			Name name = deliveryMethodList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(deliveryMethodList == null) {
			deliveryMethodList = new ArrayList<DeliveryMethod>();
		}
		if(deliveryMethodList.size() == 0) {
			deliveryMethodList.add(new DELIVERY_METHOD(string));
		} else {
			deliveryMethodList.set(0, new DELIVERY_METHOD(string));
		}
	}

	public AVAILABLE_DELIVERY_METHOD(DeliveryMethod deliveryMethod) {
		deliveryMethodList = new ArrayList<DeliveryMethod>();
		deliveryMethodList.add(deliveryMethod);
	}

	@Override
	public DeliveryMethod getDeliveryMethod() {
		if(deliveryMethodList != null && deliveryMethodList.size() > 0) {
			return deliveryMethodList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDeliveryMethod(DeliveryMethod deliveryMethod) {
		if(deliveryMethodList == null) {
			deliveryMethodList = new ArrayList<>();
		}
		if(deliveryMethodList.size() == 0) {
			deliveryMethodList.add(deliveryMethod);
		} else {
			deliveryMethodList.set(0, deliveryMethod);
		}
	}

	@Override
	public List<DeliveryMethod> getDeliveryMethodList() {
		return deliveryMethodList;
	}

	@Override
	public void setDeliveryMethodList(List<DeliveryMethod> deliveryMethodList) {
		this.deliveryMethodList = deliveryMethodList;
	}

	@Override
	public boolean hasDeliveryMethod() {
		return deliveryMethodList != null && deliveryMethodList.size() > 0 && deliveryMethodList.get(0) != null;
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
