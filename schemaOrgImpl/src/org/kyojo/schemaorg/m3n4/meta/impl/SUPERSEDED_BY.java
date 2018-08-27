package org.kyojo.schemaorg.m3n4.meta.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.Enumeration;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.meta.Clazz.Class;
import org.kyojo.schemaorg.m3n4.meta.Clazz.Property;
import org.kyojo.schemaorg.m3n4.meta.Container;
import org.kyojo.schemaorg.m3n4.meta.impl.CLASS;

public class SUPERSEDED_BY implements Container.SupersededBy {

	private static final long serialVersionUID = 1L;

	public List<Class> clazzList;
	public List<Enumeration> enumerationList;
	public List<Property> propertyList;

	public SUPERSEDED_BY() {
	}

	public SUPERSEDED_BY(String string) {
		this(new CLASS(string));
	}

	public String getString() {
		if(clazzList == null || clazzList.size() == 0 || clazzList.get(0) == null) {
			return null;
		} else {
			Name name = clazzList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(clazzList == null) {
			clazzList = new ArrayList<Class>();
		}
		if(clazzList.size() == 0) {
			clazzList.add(new CLASS(string));
		} else {
			clazzList.set(0, new CLASS(string));
		}
	}

	public SUPERSEDED_BY(Class clazz) {
		clazzList = new ArrayList<Class>();
		clazzList.add(clazz);
	}

	@Override
	public Class getClazz() {
		if(clazzList != null && clazzList.size() > 0) {
			return clazzList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setClazz(Class clazz) {
		if(clazzList == null) {
			clazzList = new ArrayList<>();
		}
		if(clazzList.size() == 0) {
			clazzList.add(clazz);
		} else {
			clazzList.set(0, clazz);
		}
	}

	@Override
	public List<Class> getClazzList() {
		return clazzList;
	}

	@Override
	public void setClazzList(List<Class> clazzList) {
		this.clazzList = clazzList;
	}

	@Override
	public boolean hasClazz() {
		return clazzList != null && clazzList.size() > 0 && clazzList.get(0) != null;
	}

	public SUPERSEDED_BY(Enumeration enumeration) {
		enumerationList = new ArrayList<Enumeration>();
		enumerationList.add(enumeration);
	}

	@Override
	public Enumeration getEnumeration() {
		if(enumerationList != null && enumerationList.size() > 0) {
			return enumerationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEnumeration(Enumeration enumeration) {
		if(enumerationList == null) {
			enumerationList = new ArrayList<>();
		}
		if(enumerationList.size() == 0) {
			enumerationList.add(enumeration);
		} else {
			enumerationList.set(0, enumeration);
		}
	}

	@Override
	public List<Enumeration> getEnumerationList() {
		return enumerationList;
	}

	@Override
	public void setEnumerationList(List<Enumeration> enumerationList) {
		this.enumerationList = enumerationList;
	}

	@Override
	public boolean hasEnumeration() {
		return enumerationList != null && enumerationList.size() > 0 && enumerationList.get(0) != null;
	}

	public SUPERSEDED_BY(Property property) {
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

	public SUPERSEDED_BY(List<Class> clazzList,
			List<Enumeration> enumerationList,
			List<Property> propertyList) {
		setClazzList(clazzList);
		setEnumerationList(enumerationList);
		setPropertyList(propertyList);
	}

	public void copy(Container.SupersededBy org) {
		setClazzList(org.getClazzList());
		setEnumerationList(org.getEnumerationList());
		setPropertyList(org.getPropertyList());
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
