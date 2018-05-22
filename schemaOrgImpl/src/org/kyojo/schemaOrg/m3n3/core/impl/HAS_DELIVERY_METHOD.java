package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.DeliveryMethod;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

public class HAS_DELIVERY_METHOD implements Container.HasDeliveryMethod {

	private static final long serialVersionUID = 1L;

	public List<DeliveryMethod> deliveryMethodList;

	public HAS_DELIVERY_METHOD() {
	}

	public HAS_DELIVERY_METHOD(String string) {
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

	public HAS_DELIVERY_METHOD(DeliveryMethod deliveryMethod) {
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
