package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.PropertyValue;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

public class ADDITIONAL_PROPERTY implements Container.AdditionalProperty {

	private static final long serialVersionUID = 1L;

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

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
