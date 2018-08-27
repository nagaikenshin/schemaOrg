package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.OrderStatus;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

public class ORDER_ITEM_STATUS implements Container.OrderItemStatus {

	private static final long serialVersionUID = 1L;

	public List<OrderStatus> orderStatusList;

	public ORDER_ITEM_STATUS() {
	}

	public ORDER_ITEM_STATUS(String string) {
		this(new ORDER_STATUS(string));
	}

	public String getString() {
		if(orderStatusList == null || orderStatusList.size() == 0 || orderStatusList.get(0) == null) {
			return null;
		} else {
			Name name = orderStatusList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(orderStatusList == null) {
			orderStatusList = new ArrayList<OrderStatus>();
		}
		if(orderStatusList.size() == 0) {
			orderStatusList.add(new ORDER_STATUS(string));
		} else {
			orderStatusList.set(0, new ORDER_STATUS(string));
		}
	}

	public ORDER_ITEM_STATUS(OrderStatus orderStatus) {
		orderStatusList = new ArrayList<OrderStatus>();
		orderStatusList.add(orderStatus);
	}

	@Override
	public OrderStatus getOrderStatus() {
		if(orderStatusList != null && orderStatusList.size() > 0) {
			return orderStatusList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOrderStatus(OrderStatus orderStatus) {
		if(orderStatusList == null) {
			orderStatusList = new ArrayList<>();
		}
		if(orderStatusList.size() == 0) {
			orderStatusList.add(orderStatus);
		} else {
			orderStatusList.set(0, orderStatus);
		}
	}

	@Override
	public List<OrderStatus> getOrderStatusList() {
		return orderStatusList;
	}

	@Override
	public void setOrderStatusList(List<OrderStatus> orderStatusList) {
		this.orderStatusList = orderStatusList;
	}

	@Override
	public boolean hasOrderStatus() {
		return orderStatusList != null && orderStatusList.size() > 0 && orderStatusList.get(0) != null;
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
