package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.Product;
import org.kyojo.schemaorg.m3n4.core.Clazz.Service;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

public class TYPE_OF_GOOD implements Container.TypeOfGood {

	private static final long serialVersionUID = 1L;

	public List<Product> productList;
	public List<Service> serviceList;

	public TYPE_OF_GOOD() {
	}

	public TYPE_OF_GOOD(String string) {
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

	public TYPE_OF_GOOD(Product product) {
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

	public TYPE_OF_GOOD(Service service) {
		serviceList = new ArrayList<Service>();
		serviceList.add(service);
	}

	@Override
	public Service getService() {
		if(serviceList != null && serviceList.size() > 0) {
			return serviceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setService(Service service) {
		if(serviceList == null) {
			serviceList = new ArrayList<>();
		}
		if(serviceList.size() == 0) {
			serviceList.add(service);
		} else {
			serviceList.set(0, service);
		}
	}

	@Override
	public List<Service> getServiceList() {
		return serviceList;
	}

	@Override
	public void setServiceList(List<Service> serviceList) {
		this.serviceList = serviceList;
	}

	@Override
	public boolean hasService() {
		return serviceList != null && serviceList.size() > 0 && serviceList.get(0) != null;
	}

	public TYPE_OF_GOOD(List<Product> productList,
			List<Service> serviceList) {
		setProductList(productList);
		setServiceList(serviceList);
	}

	public void copy(Container.TypeOfGood org) {
		setProductList(org.getProductList());
		setServiceList(org.getServiceList());
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
