package org.kyojo.schemaOrg.m3n3.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.CssSelectorType;
import org.kyojo.schemaOrg.m3n3.pending.Container;

import org.seasar.doma.Transient;

public class CSS_SELECTOR implements Container.CssSelector {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<CssSelectorType> cssSelectorTypeList;

	public CSS_SELECTOR() {
	}

	public CSS_SELECTOR(String string) {
		this(new CSS_SELECTOR_TYPE(string));
	}

	public String getString() {
		if(cssSelectorTypeList == null || cssSelectorTypeList.size() == 0 || cssSelectorTypeList.get(0) == null) {
			return null;
		} else {
			return cssSelectorTypeList.get(0).getString();
		}
	}

	public void setString(String string) {
		if(cssSelectorTypeList == null) {
			cssSelectorTypeList = new ArrayList<CssSelectorType>();
		}
		if(cssSelectorTypeList.size() == 0) {
			cssSelectorTypeList.add(new CSS_SELECTOR_TYPE(string));
		} else {
			cssSelectorTypeList.set(0, new CSS_SELECTOR_TYPE(string));
		}
	}

	public CSS_SELECTOR(CssSelectorType cssSelectorType) {
		cssSelectorTypeList = new ArrayList<CssSelectorType>();
		cssSelectorTypeList.add(cssSelectorType);
	}

	@Override
	public CssSelectorType getCssSelectorType() {
		if(cssSelectorTypeList != null && cssSelectorTypeList.size() > 0) {
			return cssSelectorTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCssSelectorType(CssSelectorType cssSelectorType) {
		if(cssSelectorTypeList == null) {
			cssSelectorTypeList = new ArrayList<>();
		}
		if(cssSelectorTypeList.size() == 0) {
			cssSelectorTypeList.add(cssSelectorType);
		} else {
			cssSelectorTypeList.set(0, cssSelectorType);
		}
	}

	@Override
	public List<CssSelectorType> getCssSelectorTypeList() {
		return cssSelectorTypeList;
	}

	@Override
	public void setCssSelectorTypeList(List<CssSelectorType> cssSelectorTypeList) {
		this.cssSelectorTypeList = cssSelectorTypeList;
	}

	@Override
	public boolean hasCssSelectorType() {
		return cssSelectorTypeList != null && cssSelectorTypeList.size() > 0 && cssSelectorTypeList.get(0) != null;
	}

	@Override
	public String getNativeValue() {
		if(getCssSelectorType() == null) return null;
		return getCssSelectorType().getNativeValue();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
