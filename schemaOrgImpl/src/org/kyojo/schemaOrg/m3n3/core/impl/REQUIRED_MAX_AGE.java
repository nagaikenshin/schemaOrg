package org.kyojo.schemaorg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz.Integer;
import org.kyojo.schemaorg.m3n3.core.Container;

public class REQUIRED_MAX_AGE implements Container.RequiredMaxAge {

	private static final long serialVersionUID = 1L;

	public List<Integer> integerList;

	public REQUIRED_MAX_AGE() {
	}

	public REQUIRED_MAX_AGE(Long l0ng) {
		this(new INTEGER(l0ng));
	}

	public REQUIRED_MAX_AGE(Integer integer) {
		integerList = new ArrayList<Integer>();
		integerList.add(integer);
	}

	@Override
	public Integer getInteger() {
		if(integerList != null && integerList.size() > 0) {
			return integerList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setInteger(Integer integer) {
		if(integerList == null) {
			integerList = new ArrayList<>();
		}
		if(integerList.size() == 0) {
			integerList.add(integer);
		} else {
			integerList.set(0, integer);
		}
	}

	@Override
	public List<Integer> getIntegerList() {
		return integerList;
	}

	@Override
	public void setIntegerList(List<Integer> integerList) {
		this.integerList = integerList;
	}

	@Override
	public boolean hasInteger() {
		return integerList != null && integerList.size() > 0 && integerList.get(0) != null;
	}

	@Override
	public Long getNativeValue() {
		if(getInteger() == null) return null;
		return getInteger().getNativeValue();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
