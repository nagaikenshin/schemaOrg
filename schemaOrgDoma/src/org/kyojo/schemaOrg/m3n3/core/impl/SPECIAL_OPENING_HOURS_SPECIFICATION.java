package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.OpeningHoursSpecification;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

import org.seasar.doma.Transient;

public class SPECIAL_OPENING_HOURS_SPECIFICATION implements Container.SpecialOpeningHoursSpecification {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<OpeningHoursSpecification> openingHoursSpecificationList;

	public SPECIAL_OPENING_HOURS_SPECIFICATION() {
	}

	public SPECIAL_OPENING_HOURS_SPECIFICATION(String string) {
		this(new OPENING_HOURS_SPECIFICATION(string));
	}

	public String getString() {
		if(openingHoursSpecificationList == null || openingHoursSpecificationList.size() == 0 || openingHoursSpecificationList.get(0) == null) {
			return null;
		} else {
			Name name = openingHoursSpecificationList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(openingHoursSpecificationList == null) {
			openingHoursSpecificationList = new ArrayList<OpeningHoursSpecification>();
		}
		if(openingHoursSpecificationList.size() == 0) {
			openingHoursSpecificationList.add(new OPENING_HOURS_SPECIFICATION(string));
		} else {
			openingHoursSpecificationList.set(0, new OPENING_HOURS_SPECIFICATION(string));
		}
	}

	public SPECIAL_OPENING_HOURS_SPECIFICATION(OpeningHoursSpecification openingHoursSpecification) {
		openingHoursSpecificationList = new ArrayList<OpeningHoursSpecification>();
		openingHoursSpecificationList.add(openingHoursSpecification);
	}

	@Override
	public OpeningHoursSpecification getOpeningHoursSpecification() {
		if(openingHoursSpecificationList != null && openingHoursSpecificationList.size() > 0) {
			return openingHoursSpecificationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOpeningHoursSpecification(OpeningHoursSpecification openingHoursSpecification) {
		if(openingHoursSpecificationList == null) {
			openingHoursSpecificationList = new ArrayList<>();
		}
		if(openingHoursSpecificationList.size() == 0) {
			openingHoursSpecificationList.add(openingHoursSpecification);
		} else {
			openingHoursSpecificationList.set(0, openingHoursSpecification);
		}
	}

	@Override
	public List<OpeningHoursSpecification> getOpeningHoursSpecificationList() {
		return openingHoursSpecificationList;
	}

	@Override
	public void setOpeningHoursSpecificationList(List<OpeningHoursSpecification> openingHoursSpecificationList) {
		this.openingHoursSpecificationList = openingHoursSpecificationList;
	}

	@Override
	public boolean hasOpeningHoursSpecification() {
		return openingHoursSpecificationList != null && openingHoursSpecificationList.size() > 0 && openingHoursSpecificationList.get(0) != null;
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
