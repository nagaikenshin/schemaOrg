package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.LocationFeatureSpecification;
import org.kyojo.schemaorg.m3n4.core.Clazz.PropertyValue;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

import org.seasar.doma.Transient;

public class ADDITIONAL_PROPERTY implements Container.AdditionalProperty {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<LocationFeatureSpecification> locationFeatureSpecificationList;
	@Transient
	public List<PropertyValue> propertyValueList;

	public ADDITIONAL_PROPERTY() {
	}

	public ADDITIONAL_PROPERTY(String string) {
		this(new PROPERTY_VALUE(string));
	}

	public String getString() {
		if(propertyValueList == null || propertyValueList.size() == 0 || propertyValueList.get(0) == null) {
			return null;
		} else {
			Name name = propertyValueList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(propertyValueList == null) {
			propertyValueList = new ArrayList<PropertyValue>();
		}
		if(propertyValueList.size() == 0) {
			propertyValueList.add(new PROPERTY_VALUE(string));
		} else {
			propertyValueList.set(0, new PROPERTY_VALUE(string));
		}
	}

	public ADDITIONAL_PROPERTY(LocationFeatureSpecification locationFeatureSpecification) {
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

	public ADDITIONAL_PROPERTY(PropertyValue propertyValue) {
		propertyValueList = new ArrayList<PropertyValue>();
		propertyValueList.add(propertyValue);
	}

	@Override
	public PropertyValue getPropertyValue() {
		if(propertyValueList != null && propertyValueList.size() > 0) {
			return propertyValueList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPropertyValue(PropertyValue propertyValue) {
		if(propertyValueList == null) {
			propertyValueList = new ArrayList<>();
		}
		if(propertyValueList.size() == 0) {
			propertyValueList.add(propertyValue);
		} else {
			propertyValueList.set(0, propertyValue);
		}
	}

	@Override
	public List<PropertyValue> getPropertyValueList() {
		return propertyValueList;
	}

	@Override
	public void setPropertyValueList(List<PropertyValue> propertyValueList) {
		this.propertyValueList = propertyValueList;
	}

	@Override
	public boolean hasPropertyValue() {
		return propertyValueList != null && propertyValueList.size() > 0 && propertyValueList.get(0) != null;
	}

	public ADDITIONAL_PROPERTY(List<LocationFeatureSpecification> locationFeatureSpecificationList,
			List<PropertyValue> propertyValueList) {
		setLocationFeatureSpecificationList(locationFeatureSpecificationList);
		setPropertyValueList(propertyValueList);
	}

	public void copy(Container.AdditionalProperty org) {
		setLocationFeatureSpecificationList(org.getLocationFeatureSpecificationList());
		setPropertyValueList(org.getPropertyValueList());
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
