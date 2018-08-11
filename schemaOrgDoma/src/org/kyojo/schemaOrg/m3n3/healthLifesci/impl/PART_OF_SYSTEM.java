package org.kyojo.schemaOrg.m3n3.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.AnatomicalSystem;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container;
import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.ANATOMICAL_SYSTEM;

import org.seasar.doma.Transient;

public class PART_OF_SYSTEM implements Container.PartOfSystem {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<AnatomicalSystem> anatomicalSystemList;

	public PART_OF_SYSTEM() {
	}

	public PART_OF_SYSTEM(String string) {
		this(new ANATOMICAL_SYSTEM(string));
	}

	public String getString() {
		if(anatomicalSystemList == null || anatomicalSystemList.size() == 0 || anatomicalSystemList.get(0) == null) {
			return null;
		} else {
			Name name = anatomicalSystemList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(anatomicalSystemList == null) {
			anatomicalSystemList = new ArrayList<AnatomicalSystem>();
		}
		if(anatomicalSystemList.size() == 0) {
			anatomicalSystemList.add(new ANATOMICAL_SYSTEM(string));
		} else {
			anatomicalSystemList.set(0, new ANATOMICAL_SYSTEM(string));
		}
	}

	public PART_OF_SYSTEM(AnatomicalSystem anatomicalSystem) {
		anatomicalSystemList = new ArrayList<AnatomicalSystem>();
		anatomicalSystemList.add(anatomicalSystem);
	}

	@Override
	public AnatomicalSystem getAnatomicalSystem() {
		if(anatomicalSystemList != null && anatomicalSystemList.size() > 0) {
			return anatomicalSystemList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAnatomicalSystem(AnatomicalSystem anatomicalSystem) {
		if(anatomicalSystemList == null) {
			anatomicalSystemList = new ArrayList<>();
		}
		if(anatomicalSystemList.size() == 0) {
			anatomicalSystemList.add(anatomicalSystem);
		} else {
			anatomicalSystemList.set(0, anatomicalSystem);
		}
	}

	@Override
	public List<AnatomicalSystem> getAnatomicalSystemList() {
		return anatomicalSystemList;
	}

	@Override
	public void setAnatomicalSystemList(List<AnatomicalSystem> anatomicalSystemList) {
		this.anatomicalSystemList = anatomicalSystemList;
	}

	@Override
	public boolean hasAnatomicalSystem() {
		return anatomicalSystemList != null && anatomicalSystemList.size() > 0 && anatomicalSystemList.get(0) != null;
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
