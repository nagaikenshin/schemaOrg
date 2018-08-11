package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.EntryPoint;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

import org.seasar.doma.Transient;

public class TARGET implements Container.Target {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<EntryPoint> entryPointList;

	public TARGET() {
	}

	public TARGET(String string) {
		this(new ENTRY_POINT(string));
	}

	public String getString() {
		if(entryPointList == null || entryPointList.size() == 0 || entryPointList.get(0) == null) {
			return null;
		} else {
			Name name = entryPointList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(entryPointList == null) {
			entryPointList = new ArrayList<EntryPoint>();
		}
		if(entryPointList.size() == 0) {
			entryPointList.add(new ENTRY_POINT(string));
		} else {
			entryPointList.set(0, new ENTRY_POINT(string));
		}
	}

	public TARGET(EntryPoint entryPoint) {
		entryPointList = new ArrayList<EntryPoint>();
		entryPointList.add(entryPoint);
	}

	@Override
	public EntryPoint getEntryPoint() {
		if(entryPointList != null && entryPointList.size() > 0) {
			return entryPointList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEntryPoint(EntryPoint entryPoint) {
		if(entryPointList == null) {
			entryPointList = new ArrayList<>();
		}
		if(entryPointList.size() == 0) {
			entryPointList.add(entryPoint);
		} else {
			entryPointList.set(0, entryPoint);
		}
	}

	@Override
	public List<EntryPoint> getEntryPointList() {
		return entryPointList;
	}

	@Override
	public void setEntryPointList(List<EntryPoint> entryPointList) {
		this.entryPointList = entryPointList;
	}

	@Override
	public boolean hasEntryPoint() {
		return entryPointList != null && entryPointList.size() > 0 && entryPointList.get(0) != null;
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
