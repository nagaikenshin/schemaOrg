package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.ProductModel;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

public class PREDECESSOR_OF implements Container.PredecessorOf {

	private static final long serialVersionUID = 1L;

	public List<ProductModel> productModelList;

	public PREDECESSOR_OF() {
	}

	public PREDECESSOR_OF(String string) {
		this(new PRODUCT_MODEL(string));
	}

	public String getString() {
		if(productModelList == null || productModelList.size() == 0 || productModelList.get(0) == null) {
			return null;
		} else {
			Name name = productModelList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(productModelList == null) {
			productModelList = new ArrayList<ProductModel>();
		}
		if(productModelList.size() == 0) {
			productModelList.add(new PRODUCT_MODEL(string));
		} else {
			productModelList.set(0, new PRODUCT_MODEL(string));
		}
	}

	public PREDECESSOR_OF(ProductModel productModel) {
		productModelList = new ArrayList<ProductModel>();
		productModelList.add(productModel);
	}

	@Override
	public ProductModel getProductModel() {
		if(productModelList != null && productModelList.size() > 0) {
			return productModelList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setProductModel(ProductModel productModel) {
		if(productModelList == null) {
			productModelList = new ArrayList<>();
		}
		if(productModelList.size() == 0) {
			productModelList.add(productModel);
		} else {
			productModelList.set(0, productModel);
		}
	}

	@Override
	public List<ProductModel> getProductModelList() {
		return productModelList;
	}

	@Override
	public void setProductModelList(List<ProductModel> productModelList) {
		this.productModelList = productModelList;
	}

	@Override
	public boolean hasProductModel() {
		return productModelList != null && productModelList.size() > 0 && productModelList.get(0) != null;
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
