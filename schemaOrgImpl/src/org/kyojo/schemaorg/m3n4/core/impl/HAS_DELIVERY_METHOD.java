package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.DeliveryMethod;
import org.kyojo.schemaorg.m3n4.core.Clazz.LockerDelivery;
import org.kyojo.schemaorg.m3n4.core.Clazz.ParcelService;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

public class HAS_DELIVERY_METHOD implements Container.HasDeliveryMethod {

	private static final long serialVersionUID = 1L;

	public List<DeliveryMethod> deliveryMethodList;
	public List<LockerDelivery> lockerDeliveryList;
	public List<ParcelService> parcelServiceList;

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

	public HAS_DELIVERY_METHOD(LockerDelivery lockerDelivery) {
		lockerDeliveryList = new ArrayList<LockerDelivery>();
		lockerDeliveryList.add(lockerDelivery);
	}

	@Override
	public LockerDelivery getLockerDelivery() {
		if(lockerDeliveryList != null && lockerDeliveryList.size() > 0) {
			return lockerDeliveryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLockerDelivery(LockerDelivery lockerDelivery) {
		if(lockerDeliveryList == null) {
			lockerDeliveryList = new ArrayList<>();
		}
		if(lockerDeliveryList.size() == 0) {
			lockerDeliveryList.add(lockerDelivery);
		} else {
			lockerDeliveryList.set(0, lockerDelivery);
		}
	}

	@Override
	public List<LockerDelivery> getLockerDeliveryList() {
		return lockerDeliveryList;
	}

	@Override
	public void setLockerDeliveryList(List<LockerDelivery> lockerDeliveryList) {
		this.lockerDeliveryList = lockerDeliveryList;
	}

	@Override
	public boolean hasLockerDelivery() {
		return lockerDeliveryList != null && lockerDeliveryList.size() > 0 && lockerDeliveryList.get(0) != null;
	}

	public HAS_DELIVERY_METHOD(ParcelService parcelService) {
		parcelServiceList = new ArrayList<ParcelService>();
		parcelServiceList.add(parcelService);
	}

	@Override
	public ParcelService getParcelService() {
		if(parcelServiceList != null && parcelServiceList.size() > 0) {
			return parcelServiceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setParcelService(ParcelService parcelService) {
		if(parcelServiceList == null) {
			parcelServiceList = new ArrayList<>();
		}
		if(parcelServiceList.size() == 0) {
			parcelServiceList.add(parcelService);
		} else {
			parcelServiceList.set(0, parcelService);
		}
	}

	@Override
	public List<ParcelService> getParcelServiceList() {
		return parcelServiceList;
	}

	@Override
	public void setParcelServiceList(List<ParcelService> parcelServiceList) {
		this.parcelServiceList = parcelServiceList;
	}

	@Override
	public boolean hasParcelService() {
		return parcelServiceList != null && parcelServiceList.size() > 0 && parcelServiceList.get(0) != null;
	}

	public HAS_DELIVERY_METHOD(List<DeliveryMethod> deliveryMethodList,
			List<LockerDelivery> lockerDeliveryList,
			List<ParcelService> parcelServiceList) {
		setDeliveryMethodList(deliveryMethodList);
		setLockerDeliveryList(lockerDeliveryList);
		setParcelServiceList(parcelServiceList);
	}

	public void copy(Container.HasDeliveryMethod org) {
		setDeliveryMethodList(org.getDeliveryMethodList());
		setLockerDeliveryList(org.getLockerDeliveryList());
		setParcelServiceList(org.getParcelServiceList());
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
