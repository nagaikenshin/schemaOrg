package org.kyojo.schemaOrg.m3n3.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.Legislation;
import org.kyojo.schemaOrg.m3n3.pending.Container;
import org.kyojo.schemaOrg.m3n3.pending.impl.LEGISLATION;

import org.seasar.doma.Transient;

public class LEGISLATION_CHANGED_BY implements Container.LegislationChangedBy {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<Legislation> legislationList;

	public LEGISLATION_CHANGED_BY() {
	}

	public LEGISLATION_CHANGED_BY(String string) {
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

	public LEGISLATION_CHANGED_BY(Legislation legislation) {
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

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
