package org.kyojo.schemaOrg.m3n3.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.AnatomicalStructure;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.AnatomicalSystem;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container;
import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.ANATOMICAL_STRUCTURE;

import org.seasar.doma.Transient;

public class COMPRISED_OF implements Container.ComprisedOf {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<AnatomicalStructure> anatomicalStructureList;
	@Transient
	public List<AnatomicalSystem> anatomicalSystemList;

	public COMPRISED_OF() {
	}

	public COMPRISED_OF(String string) {
		this(new ANATOMICAL_STRUCTURE(string));
	}

	public String getString() {
		if(anatomicalStructureList == null || anatomicalStructureList.size() == 0 || anatomicalStructureList.get(0) == null) {
			return null;
		} else {
			Name name = anatomicalStructureList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(anatomicalStructureList == null) {
			anatomicalStructureList = new ArrayList<AnatomicalStructure>();
		}
		if(anatomicalStructureList.size() == 0) {
			anatomicalStructureList.add(new ANATOMICAL_STRUCTURE(string));
		} else {
			anatomicalStructureList.set(0, new ANATOMICAL_STRUCTURE(string));
		}
	}

	public COMPRISED_OF(AnatomicalStructure anatomicalStructure) {
		anatomicalStructureList = new ArrayList<AnatomicalStructure>();
		anatomicalStructureList.add(anatomicalStructure);
	}

	@Override
	public AnatomicalStructure getAnatomicalStructure() {
		if(anatomicalStructureList != null && anatomicalStructureList.size() > 0) {
			return anatomicalStructureList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAnatomicalStructure(AnatomicalStructure anatomicalStructure) {
		if(anatomicalStructureList == null) {
			anatomicalStructureList = new ArrayList<>();
		}
		if(anatomicalStructureList.size() == 0) {
			anatomicalStructureList.add(anatomicalStructure);
		} else {
			anatomicalStructureList.set(0, anatomicalStructure);
		}
	}

	@Override
	public List<AnatomicalStructure> getAnatomicalStructureList() {
		return anatomicalStructureList;
	}

	@Override
	public void setAnatomicalStructureList(List<AnatomicalStructure> anatomicalStructureList) {
		this.anatomicalStructureList = anatomicalStructureList;
	}

	@Override
	public boolean hasAnatomicalStructure() {
		return anatomicalStructureList != null && anatomicalStructureList.size() > 0 && anatomicalStructureList.get(0) != null;
	}

	public COMPRISED_OF(AnatomicalSystem anatomicalSystem) {
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

	public COMPRISED_OF(List<AnatomicalStructure> anatomicalStructureList,
			List<AnatomicalSystem> anatomicalSystemList) {
		setAnatomicalStructureList(anatomicalStructureList);
		setAnatomicalSystemList(anatomicalSystemList);
	}

	public void copy(Container.ComprisedOf org) {
		setAnatomicalStructureList(org.getAnatomicalStructureList());
		setAnatomicalSystemList(org.getAnatomicalSystemList());
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
