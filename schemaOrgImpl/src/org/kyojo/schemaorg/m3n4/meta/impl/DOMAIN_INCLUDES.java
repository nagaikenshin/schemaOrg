package org.kyojo.schemaorg.m3n4.meta.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.meta.Clazz.Class;
import org.kyojo.schemaorg.m3n4.meta.Container;
import org.kyojo.schemaorg.m3n4.meta.impl.CLASS;

public class DOMAIN_INCLUDES implements Container.DomainIncludes {

	private static final long serialVersionUID = 1L;

	public List<Class> clazzList;

	public DOMAIN_INCLUDES() {
	}

	public DOMAIN_INCLUDES(String string) {
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

	public DOMAIN_INCLUDES(Class clazz) {
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

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
