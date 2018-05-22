package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.DataType.Boolean;

public class VALUE_ADDED_TAX_INCLUDED implements Container.ValueAddedTaxIncluded {

	private static final long serialVersionUID = 1L;

	public List<Boolean> b00leanList;

	public VALUE_ADDED_TAX_INCLUDED() {
	}

	public VALUE_ADDED_TAX_INCLUDED(java.lang.Boolean b00lean) {
		this(new BOOLEAN(b00lean));
	}

	public VALUE_ADDED_TAX_INCLUDED(Boolean b00lean) {
		b00leanList = new ArrayList<Boolean>();
		b00leanList.add(b00lean);
	}

	@Override
	public Boolean getB00lean() {
		if(b00leanList != null && b00leanList.size() > 0) {
			return b00leanList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setB00lean(Boolean b00lean) {
		if(b00leanList == null) {
			b00leanList = new ArrayList<>();
		}
		if(b00leanList.size() == 0) {
			b00leanList.add(b00lean);
		} else {
			b00leanList.set(0, b00lean);
		}
	}

	@Override
	public List<Boolean> getB00leanList() {
		return b00leanList;
	}

	@Override
	public void setB00leanList(List<Boolean> b00leanList) {
		this.b00leanList = b00leanList;
	}

	@Override
	public boolean hasB00lean() {
		return b00leanList != null && b00leanList.size() > 0 && b00leanList.get(0) != null;
	}

	@Override
	public java.lang.Boolean getNativeValue() {
		if(getB00lean() == null) return null;
		return getB00lean().getNativeValue();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
