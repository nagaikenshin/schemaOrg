package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.Order;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

public class PART_OF_ORDER implements Container.PartOfOrder {

	private static final long serialVersionUID = 1L;

	public List<Order> orderList;

	public PART_OF_ORDER() {
	}

	public PART_OF_ORDER(String string) {
		this(new ORDER(string));
	}

	public String getString() {
		if(orderList == null || orderList.size() == 0 || orderList.get(0) == null) {
			return null;
		} else {
			Name name = orderList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(orderList == null) {
			orderList = new ArrayList<Order>();
		}
		if(orderList.size() == 0) {
			orderList.add(new ORDER(string));
		} else {
			orderList.set(0, new ORDER(string));
		}
	}

	public PART_OF_ORDER(Order order) {
		orderList = new ArrayList<Order>();
		orderList.add(order);
	}

	@Override
	public Order getOrder() {
		if(orderList != null && orderList.size() > 0) {
			return orderList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOrder(Order order) {
		if(orderList == null) {
			orderList = new ArrayList<>();
		}
		if(orderList.size() == 0) {
			orderList.add(order);
		} else {
			orderList.set(0, order);
		}
	}

	@Override
	public List<Order> getOrderList() {
		return orderList;
	}

	@Override
	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}

	@Override
	public boolean hasOrder() {
		return orderList != null && orderList.size() > 0 && orderList.get(0) != null;
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
