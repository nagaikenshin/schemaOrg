package org.kyojo.schemaorg.m3n5.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Container.Name;
import org.kyojo.schemaorg.m3n5.pending.Clazz.Legislation;
import org.kyojo.schemaorg.m3n5.pending.Clazz.LegislationObject;
import org.kyojo.schemaorg.m3n5.pending.Container;
import org.kyojo.schemaorg.m3n5.pending.impl.LEGISLATION;

import org.seasar.doma.Transient;

public class LEGISLATION_CHANGES implements Container.LegislationChanges {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<Legislation> legislationList;
	@Transient
	public List<LegislationObject> legislationObjectList;

	public LEGISLATION_CHANGES() {
	}

	public LEGISLATION_CHANGES(String string) {
		this(new LEGISLATION(string));
	}

	public String getString() {
		if(legislationList == null || legislationList.size() == 0 || legislationList.get(0) == null) {
			return null;
		} else {
			Name name = legislationList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(legislationList == null) {
			legislationList = new ArrayList<Legislation>();
		}
		if(legislationList.size() == 0) {
			legislationList.add(new LEGISLATION(string));
		} else {
			legislationList.set(0, new LEGISLATION(string));
		}
	}

	public LEGISLATION_CHANGES(Legislation legislation) {
		legislationList = new ArrayList<Legislation>();
		legislationList.add(legislation);
	}

	@Override
	public Legislation getLegislation() {
		if(legislationList != null && legislationList.size() > 0) {
			return legislationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLegislation(Legislation legislation) {
		if(legislationList == null) {
			legislationList = new ArrayList<>();
		}
		if(legislationList.size() == 0) {
			legislationList.add(legislation);
		} else {
			legislationList.set(0, legislation);
		}
	}

	@Override
	public List<Legislation> getLegislationList() {
		return legislationList;
	}

	@Override
	public void setLegislationList(List<Legislation> legislationList) {
		this.legislationList = legislationList;
	}

	@Override
	public boolean hasLegislation() {
		return legislationList != null && legislationList.size() > 0 && legislationList.get(0) != null;
	}

	public LEGISLATION_CHANGES(LegislationObject legislationObject) {
		legislationObjectList = new ArrayList<LegislationObject>();
		legislationObjectList.add(legislationObject);
	}

	@Override
	public LegislationObject getLegislationObject() {
		if(legislationObjectList != null && legislationObjectList.size() > 0) {
			return legislationObjectList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLegislationObject(LegislationObject legislationObject) {
		if(legislationObjectList == null) {
			legislationObjectList = new ArrayList<>();
		}
		if(legislationObjectList.size() == 0) {
			legislationObjectList.add(legislationObject);
		} else {
			legislationObjectList.set(0, legislationObject);
		}
	}

	@Override
	public List<LegislationObject> getLegislationObjectList() {
		return legislationObjectList;
	}

	@Override
	public void setLegislationObjectList(List<LegislationObject> legislationObjectList) {
		this.legislationObjectList = legislationObjectList;
	}

	@Override
	public boolean hasLegislationObject() {
		return legislationObjectList != null && legislationObjectList.size() > 0 && legislationObjectList.get(0) != null;
	}

	public LEGISLATION_CHANGES(List<Legislation> legislationList,
			List<LegislationObject> legislationObjectList) {
		setLegislationList(legislationList);
		setLegislationObjectList(legislationObjectList);
	}

	public void copy(Container.LegislationChanges org) {
		setLegislationList(org.getLegislationList());
		setLegislationObjectList(org.getLegislationObjectList());
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
