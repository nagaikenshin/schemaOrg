package org.kyojo.schemaorg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz.OwnershipInfo;
import org.kyojo.schemaorg.m3n3.core.Clazz.Product;
import org.kyojo.schemaorg.m3n3.core.Container;
import org.kyojo.schemaorg.m3n3.core.Container.Name;

import org.seasar.doma.Transient;

public class OWNS implements Container.Owns {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<OwnershipInfo> ownershipInfoList;
	@Transient
	public List<Product> productList;

	public OWNS() {
	}

	public OWNS(String string) {
		this(new OWNERSHIP_INFO(string));
	}

	public String getString() {
		if(ownershipInfoList == null || ownershipInfoList.size() == 0 || ownershipInfoList.get(0) == null) {
			return null;
		} else {
			Name name = ownershipInfoList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(ownershipInfoList == null) {
			ownershipInfoList = new ArrayList<OwnershipInfo>();
		}
		if(ownershipInfoList.size() == 0) {
			ownershipInfoList.add(new OWNERSHIP_INFO(string));
		} else {
			ownershipInfoList.set(0, new OWNERSHIP_INFO(string));
		}
	}

	public OWNS(OwnershipInfo ownershipInfo) {
		ownershipInfoList = new ArrayList<OwnershipInfo>();
		ownershipInfoList.add(ownershipInfo);
	}

	@Override
	public OwnershipInfo getOwnershipInfo() {
		if(ownershipInfoList != null && ownershipInfoList.size() > 0) {
			return ownershipInfoList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOwnershipInfo(OwnershipInfo ownershipInfo) {
		if(ownershipInfoList == null) {
			ownershipInfoList = new ArrayList<>();
		}
		if(ownershipInfoList.size() == 0) {
			ownershipInfoList.add(ownershipInfo);
		} else {
			ownershipInfoList.set(0, ownershipInfo);
		}
	}

	@Override
	public List<OwnershipInfo> getOwnershipInfoList() {
		return ownershipInfoList;
	}

	@Override
	public void setOwnershipInfoList(List<OwnershipInfo> ownershipInfoList) {
		this.ownershipInfoList = ownershipInfoList;
	}

	@Override
	public boolean hasOwnershipInfo() {
		return ownershipInfoList != null && ownershipInfoList.size() > 0 && ownershipInfoList.get(0) != null;
	}

	public OWNS(Product product) {
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

	public OWNS(List<OwnershipInfo> ownershipInfoList,
			List<Product> productList) {
		setOwnershipInfoList(ownershipInfoList);
		setProductList(productList);
	}

	public void copy(Container.Owns org) {
		setOwnershipInfoList(org.getOwnershipInfoList());
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
