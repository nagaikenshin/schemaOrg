package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.pending.Clazz.XPathType;
import org.kyojo.schemaorg.m3n5.pending.impl.X_PATH_TYPE;

import org.seasar.doma.Transient;

public class XPATH implements Container.Xpath {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<XPathType> xPathTypeList;

	public XPATH() {
	}

	public XPATH(String string) {
		this(new X_PATH_TYPE(string));
	}

	public String getString() {
		if(xPathTypeList == null || xPathTypeList.size() == 0 || xPathTypeList.get(0) == null) {
			return null;
		} else {
			return xPathTypeList.get(0).getString();
		}
	}

	public void setString(String string) {
		if(xPathTypeList == null) {
			xPathTypeList = new ArrayList<XPathType>();
		}
		if(xPathTypeList.size() == 0) {
			xPathTypeList.add(new X_PATH_TYPE(string));
		} else {
			xPathTypeList.set(0, new X_PATH_TYPE(string));
		}
	}

	public XPATH(XPathType xPathType) {
		xPathTypeList = new ArrayList<XPathType>();
		xPathTypeList.add(xPathType);
	}

	@Override
	public XPathType getXPathType() {
		if(xPathTypeList != null && xPathTypeList.size() > 0) {
			return xPathTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setXPathType(XPathType xPathType) {
		if(xPathTypeList == null) {
			xPathTypeList = new ArrayList<>();
		}
		if(xPathTypeList.size() == 0) {
			xPathTypeList.add(xPathType);
		} else {
			xPathTypeList.set(0, xPathType);
		}
	}

	@Override
	public List<XPathType> getXPathTypeList() {
		return xPathTypeList;
	}

	@Override
	public void setXPathTypeList(List<XPathType> xPathTypeList) {
		this.xPathTypeList = xPathTypeList;
	}

	@Override
	public boolean hasXPathType() {
		return xPathTypeList != null && xPathTypeList.size() > 0 && xPathTypeList.get(0) != null;
	}

	@Override
	public String getNativeValue() {
		if(getXPathType() == null) return null;
		return getXPathType().getNativeValue();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
