package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.RestrictedDiet;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.Container.Name;

public class SUITABLE_FOR_DIET implements Container.SuitableForDiet {

	private static final long serialVersionUID = 1L;

	public List<RestrictedDiet> restrictedDietList;

	public SUITABLE_FOR_DIET() {
	}

	public SUITABLE_FOR_DIET(String string) {
		this(new RESTRICTED_DIET(string));
	}

	public String getString() {
		if(restrictedDietList == null || restrictedDietList.size() == 0 || restrictedDietList.get(0) == null) {
			return null;
		} else {
			Name name = restrictedDietList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(restrictedDietList == null) {
			restrictedDietList = new ArrayList<RestrictedDiet>();
		}
		if(restrictedDietList.size() == 0) {
			restrictedDietList.add(new RESTRICTED_DIET(string));
		} else {
			restrictedDietList.set(0, new RESTRICTED_DIET(string));
		}
	}

	public SUITABLE_FOR_DIET(RestrictedDiet restrictedDiet) {
		restrictedDietList = new ArrayList<RestrictedDiet>();
		restrictedDietList.add(restrictedDiet);
	}

	@Override
	public RestrictedDiet getRestrictedDiet() {
		if(restrictedDietList != null && restrictedDietList.size() > 0) {
			return restrictedDietList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRestrictedDiet(RestrictedDiet restrictedDiet) {
		if(restrictedDietList == null) {
			restrictedDietList = new ArrayList<>();
		}
		if(restrictedDietList.size() == 0) {
			restrictedDietList.add(restrictedDiet);
		} else {
			restrictedDietList.set(0, restrictedDiet);
		}
	}

	@Override
	public List<RestrictedDiet> getRestrictedDietList() {
		return restrictedDietList;
	}

	@Override
	public void setRestrictedDietList(List<RestrictedDiet> restrictedDietList) {
		this.restrictedDietList = restrictedDietList;
	}

	@Override
	public boolean hasRestrictedDiet() {
		return restrictedDietList != null && restrictedDietList.size() > 0 && restrictedDietList.get(0) != null;
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
