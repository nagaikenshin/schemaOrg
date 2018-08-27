package org.kyojo.schemaorg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz.OrderItem;
import org.kyojo.schemaorg.m3n3.core.Clazz.Product;
import org.kyojo.schemaorg.m3n3.core.Container;
import org.kyojo.schemaorg.m3n3.core.Container.Name;

public class ORDERED_ITEM implements Container.OrderedItem {

	private static final long serialVersionUID = 1L;

	public List<OrderItem> orderItemList;
	public List<Product> productList;

	public ORDERED_ITEM() {
	}

	public ORDERED_ITEM(String string) {
		this(new ORDER_ITEM(string));
	}

	public String getString() {
		if(orderItemList == null || orderItemList.size() == 0 || orderItemList.get(0) == null) {
			return null;
		} else {
			Name name = orderItemList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(orderItemList == null) {
			orderItemList = new ArrayList<OrderItem>();
		}
		if(orderItemList.size() == 0) {
			orderItemList.add(new ORDER_ITEM(string));
		} else {
			orderItemList.set(0, new ORDER_ITEM(string));
		}
	}

	public ORDERED_ITEM(OrderItem orderItem) {
		orderItemList = new ArrayList<OrderItem>();
		orderItemList.add(orderItem);
	}

	@Override
	public OrderItem getOrderItem() {
		if(orderItemList != null && orderItemList.size() > 0) {
			return orderItemList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOrderItem(OrderItem orderItem) {
		if(orderItemList == null) {
			orderItemList = new ArrayList<>();
		}
		if(orderItemList.size() == 0) {
			orderItemList.add(orderItem);
		} else {
			orderItemList.set(0, orderItem);
		}
	}

	@Override
	public List<OrderItem> getOrderItemList() {
		return orderItemList;
	}

	@Override
	public void setOrderItemList(List<OrderItem> orderItemList) {
		this.orderItemList = orderItemList;
	}

	@Override
	public boolean hasOrderItem() {
		return orderItemList != null && orderItemList.size() > 0 && orderItemList.get(0) != null;
	}

	public ORDERED_ITEM(Product product) {
		productList = new ArrayList<Product>();
		productList.add(product);
	}

	@Override
	public Product getProduct() {
		if(productList != null && productList.size() > 0) {
			return productList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setProduct(Product product) {
		if(productList == null) {
			productList = new ArrayList<>();
		}
		if(productList.size() == 0) {
			productList.add(product);
		} else {
			productList.set(0, product);
		}
	}

	@Override
	public List<Product> getProductList() {
		return productList;
	}

	@Override
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	@Override
	public boolean hasProduct() {
		return productList != null && productList.size() > 0 && productList.get(0) != null;
	}

	public ORDERED_ITEM(List<OrderItem> orderItemList,
			List<Product> productList) {
		setOrderItemList(orderItemList);
		setProductList(productList);
	}

	public void copy(Container.OrderedItem org) {
		setOrderItemList(org.getOrderItemList());
		setProductList(org.getProductList());
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
