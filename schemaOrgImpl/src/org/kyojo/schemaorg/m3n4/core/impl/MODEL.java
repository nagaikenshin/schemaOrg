package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.ProductModel;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.DataType.Text;

public class MODEL implements Container.Model {

	private static final long serialVersionUID = 1L;

	public List<ProductModel> productModelList;
	public List<Text> textList;

	public MODEL() {
	}

	public MODEL(ProductModel productModel) {
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

	public MODEL(String string) {
		this(new TEXT(string));
	}

	public MODEL(Text text) {
		textList = new ArrayList<Text>();
		textList.add(text);
	}

	@Override
	public Text getText() {
		if(textList != null && textList.size() > 0) {
			return textList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setText(Text text) {
		if(textList == null) {
			textList = new ArrayList<>();
		}
		if(textList.size() == 0) {
			textList.add(text);
		} else {
			textList.set(0, text);
		}
	}

	@Override
	public List<Text> getTextList() {
		return textList;
	}

	@Override
	public void setTextList(List<Text> textList) {
		this.textList = textList;
	}

	@Override
	public boolean hasText() {
		return textList != null && textList.size() > 0 && textList.get(0) != null;
	}

	public MODEL(List<ProductModel> productModelList,
			List<Text> textList) {
		setProductModelList(productModelList);
		setTextList(textList);
	}

	public void copy(Container.Model org) {
		setProductModelList(org.getProductModelList());
		setTextList(org.getTextList());
	}

	@Override
	public String getNativeValue() {
		if(getText() == null) return null;
		return getText().getNativeValue();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
