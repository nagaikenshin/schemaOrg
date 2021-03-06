package org.kyojo.schemaorg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz.OpeningHoursSpecification;
import org.kyojo.schemaorg.m3n3.core.Container;
import org.kyojo.schemaorg.m3n3.core.Container.Name;

public class HOURS_AVAILABLE implements Container.HoursAvailable {

	private static final long serialVersionUID = 1L;

	public List<OpeningHoursSpecification> openingHoursSpecificationList;

	public HOURS_AVAILABLE() {
	}

	public HOURS_AVAILABLE(String string) {
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

	public HOURS_AVAILABLE(OpeningHoursSpecification openingHoursSpecification) {
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
