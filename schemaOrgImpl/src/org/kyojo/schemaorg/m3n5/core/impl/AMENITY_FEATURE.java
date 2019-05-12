package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.LocationFeatureSpecification;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.Container.Name;

public class AMENITY_FEATURE implements Container.AmenityFeature {

	private static final long serialVersionUID = 1L;

	public List<LocationFeatureSpecification> locationFeatureSpecificationList;

	public AMENITY_FEATURE() {
	}

	public AMENITY_FEATURE(String string) {
		this(new LOCATION_FEATURE_SPECIFICATION(string));
	}

	public String getString() {
		if(locationFeatureSpecificationList == null || locationFeatureSpecificationList.size() == 0 || locationFeatureSpecificationList.get(0) == null) {
			return null;
		} else {
			Name name = locationFeatureSpecificationList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(locationFeatureSpecificationList == null) {
			locationFeatureSpecificationList = new ArrayList<LocationFeatureSpecification>();
		}
		if(locationFeatureSpecificationList.size() == 0) {
			locationFeatureSpecificationList.add(new LOCATION_FEATURE_SPECIFICATION(string));
		} else {
			locationFeatureSpecificationList.set(0, new LOCATION_FEATURE_SPECIFICATION(string));
		}
	}

	public AMENITY_FEATURE(LocationFeatureSpecification locationFeatureSpecification) {
		locationFeatureSpecificationList = new ArrayList<LocationFeatureSpecification>();
		locationFeatureSpecificationList.add(locationFeatureSpecification);
	}

	@Override
	public LocationFeatureSpecification getLocationFeatureSpecification() {
		if(locationFeatureSpecificationList != null && locationFeatureSpecificationList.size() > 0) {
			return locationFeatureSpecificationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLocationFeatureSpecification(LocationFeatureSpecification locationFeatureSpecification) {
		if(locationFeatureSpecificationList == null) {
			locationFeatureSpecificationList = new ArrayList<>();
		}
		if(locationFeatureSpecificationList.size() == 0) {
			locationFeatureSpecificationList.add(locationFeatureSpecification);
		} else {
			locationFeatureSpecificationList.set(0, locationFeatureSpecification);
		}
	}

	@Override
	public List<LocationFeatureSpecification> getLocationFeatureSpecificationList() {
		return locationFeatureSpecificationList;
	}

	@Override
	public void setLocationFeatureSpecificationList(List<LocationFeatureSpecification> locationFeatureSpecificationList) {
		this.locationFeatureSpecificationList = locationFeatureSpecificationList;
	}

	@Override
	public boolean hasLocationFeatureSpecification() {
		return locationFeatureSpecificationList != null && locationFeatureSpecificationList.size() > 0 && locationFeatureSpecificationList.get(0) != null;
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
