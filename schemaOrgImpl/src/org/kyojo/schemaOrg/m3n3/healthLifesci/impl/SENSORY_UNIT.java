package org.kyojo.schemaOrg.m3n3.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.AnatomicalStructure;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.SuperficialAnatomy;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container;
import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.ANATOMICAL_STRUCTURE;

public class SENSORY_UNIT implements Container.SensoryUnit {

	private static final long serialVersionUID = 1L;

	public List<AnatomicalStructure> anatomicalStructureList;
	public List<SuperficialAnatomy> superficialAnatomyList;

	public SENSORY_UNIT() {
	}

	public SENSORY_UNIT(String string) {
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

	public SENSORY_UNIT(AnatomicalStructure anatomicalStructure) {
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

	public SENSORY_UNIT(SuperficialAnatomy superficialAnatomy) {
		superficialAnatomyList = new ArrayList<SuperficialAnatomy>();
		superficialAnatomyList.add(superficialAnatomy);
	}

	@Override
	public SuperficialAnatomy getSuperficialAnatomy() {
		if(superficialAnatomyList != null && superficialAnatomyList.size() > 0) {
			return superficialAnatomyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSuperficialAnatomy(SuperficialAnatomy superficialAnatomy) {
		if(superficialAnatomyList == null) {
			superficialAnatomyList = new ArrayList<>();
		}
		if(superficialAnatomyList.size() == 0) {
			superficialAnatomyList.add(superficialAnatomy);
		} else {
			superficialAnatomyList.set(0, superficialAnatomy);
		}
	}

	@Override
	public List<SuperficialAnatomy> getSuperficialAnatomyList() {
		return superficialAnatomyList;
	}

	@Override
	public void setSuperficialAnatomyList(List<SuperficialAnatomy> superficialAnatomyList) {
		this.superficialAnatomyList = superficialAnatomyList;
	}

	@Override
	public boolean hasSuperficialAnatomy() {
		return superficialAnatomyList != null && superficialAnatomyList.size() > 0 && superficialAnatomyList.get(0) != null;
	}

	public SENSORY_UNIT(List<AnatomicalStructure> anatomicalStructureList,
			List<SuperficialAnatomy> superficialAnatomyList) {
		setAnatomicalStructureList(anatomicalStructureList);
		setSuperficialAnatomyList(superficialAnatomyList);
	}

	public void copy(Container.SensoryUnit org) {
		setAnatomicalStructureList(org.getAnatomicalStructureList());
		setSuperficialAnatomyList(org.getSuperficialAnatomyList());
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
