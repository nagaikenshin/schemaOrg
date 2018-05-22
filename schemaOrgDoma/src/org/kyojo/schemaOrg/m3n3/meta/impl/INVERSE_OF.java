package org.kyojo.schemaOrg.m3n3.meta.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.meta.Clazz.Property;
import org.kyojo.schemaOrg.m3n3.meta.Container;
import org.kyojo.schemaOrg.m3n3.meta.impl.PROPERTY;

import org.seasar.doma.Transient;

public class INVERSE_OF implements Container.InverseOf {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<Property> propertyList;

	public INVERSE_OF() {
	}

	public INVERSE_OF(String string) {
		this(new PROPERTY(string));
	}

	public String getString() {
		if(propertyList == null || propertyList.size() == 0 || propertyList.get(0) == null) {
			return null;
		} else {
			Name name = propertyList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(propertyList == null) {
			propertyList = new ArrayList<Property>();
		}
		if(propertyList.size() == 0) {
			propertyList.add(new PROPERTY(string));
		} else {
			propertyList.set(0, new PROPERTY(string));
		}
	}

	public INVERSE_OF(Property property) {
		propertyList = new ArrayList<Property>();
		propertyList.add(property);
	}

	@Override
	public Property getProperty() {
		if(propertyList != null && propertyList.size() > 0) {
			return propertyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setProperty(Property property) {
		if(propertyList == null) {
			propertyList = new ArrayList<>();
		}
		if(propertyList.size() == 0) {
			propertyList.add(property);
		} else {
			propertyList.set(0, property);
		}
	}

	@Override
	public List<Property> getPropertyList() {
		return propertyList;
	}

	@Override
	public void setPropertyList(List<Property> propertyList) {
		this.propertyList = propertyList;
	}

	@Override
	public boolean hasProperty() {
		return propertyList != null && propertyList.size() > 0 && propertyList.get(0) != null;
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
