package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Product;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

public class IS_ACCESSORY_OR_SPARE_PART_FOR implements Container.IsAccessoryOrSparePartFor {

	private static final long serialVersionUID = 1L;

	public List<Product> productList;

	public IS_ACCESSORY_OR_SPARE_PART_FOR() {
	}

	public IS_ACCESSORY_OR_SPARE_PART_FOR(String string) {
		this(new PRODUCT(string));
	}

	public String getString() {
		if(productList == null || productList.size() == 0 || productList.get(0) == null) {
			return null;
		} else {
			Name name = productList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(productList == null) {
			productList = new ArrayList<Product>();
		}
		if(productList.size() == 0) {
			productList.add(new PRODUCT(string));
		} else {
			productList.set(0, new PRODUCT(string));
		}
	}

	public IS_ACCESSORY_OR_SPARE_PART_FOR(Product product) {
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

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
