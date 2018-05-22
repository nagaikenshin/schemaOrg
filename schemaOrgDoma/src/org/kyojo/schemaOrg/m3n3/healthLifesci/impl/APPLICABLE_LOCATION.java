package org.kyojo.schemaOrg.m3n3.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.AdministrativeArea;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.core.impl.ADMINISTRATIVE_AREA;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container;

import org.seasar.doma.Transient;

public class APPLICABLE_LOCATION implements Container.ApplicableLocation {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<AdministrativeArea> administrativeAreaList;

	public APPLICABLE_LOCATION() {
	}

	public APPLICABLE_LOCATION(String string) {
		this(new ADMINISTRATIVE_AREA(string));
	}

	public String getString() {
		if(administrativeAreaList == null || administrativeAreaList.size() == 0 || administrativeAreaList.get(0) == null) {
			return null;
		} else {
			Name name = administrativeAreaList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(administrativeAreaList == null) {
			administrativeAreaList = new ArrayList<AdministrativeArea>();
		}
		if(administrativeAreaList.size() == 0) {
			administrativeAreaList.add(new ADMINISTRATIVE_AREA(string));
		} else {
			administrativeAreaList.set(0, new ADMINISTRATIVE_AREA(string));
		}
	}

	public APPLICABLE_LOCATION(AdministrativeArea administrativeArea) {
		administrativeAreaList = new ArrayList<AdministrativeArea>();
		administrativeAreaList.add(administrativeArea);
	}

	@Override
	public AdministrativeArea getAdministrativeArea() {
		if(administrativeAreaList != null && administrativeAreaList.size() > 0) {
			return administrativeAreaList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAdministrativeArea(AdministrativeArea administrativeArea) {
		if(administrativeAreaList == null) {
			administrativeAreaList = new ArrayList<>();
		}
		if(administrativeAreaList.size() == 0) {
			administrativeAreaList.add(administrativeArea);
		} else {
			administrativeAreaList.set(0, administrativeArea);
		}
	}

	@Override
	public List<AdministrativeArea> getAdministrativeAreaList() {
		return administrativeAreaList;
	}

	@Override
	public void setAdministrativeAreaList(List<AdministrativeArea> administrativeAreaList) {
		this.administrativeAreaList = administrativeAreaList;
	}

	@Override
	public boolean hasAdministrativeArea() {
		return administrativeAreaList != null && administrativeAreaList.size() > 0 && administrativeAreaList.get(0) != null;
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
