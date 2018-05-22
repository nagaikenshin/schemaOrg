package org.kyojo.schemaOrg.m3n3.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.BrainStructure;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container;
import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.BRAIN_STRUCTURE;

public class SOURCED_FROM implements Container.SourcedFrom {

	private static final long serialVersionUID = 1L;

	public List<BrainStructure> brainStructureList;

	public SOURCED_FROM() {
	}

	public SOURCED_FROM(String string) {
		this(new BRAIN_STRUCTURE(string));
	}

	public String getString() {
		if(brainStructureList == null || brainStructureList.size() == 0 || brainStructureList.get(0) == null) {
			return null;
		} else {
			Name name = brainStructureList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(brainStructureList == null) {
			brainStructureList = new ArrayList<BrainStructure>();
		}
		if(brainStructureList.size() == 0) {
			brainStructureList.add(new BRAIN_STRUCTURE(string));
		} else {
			brainStructureList.set(0, new BRAIN_STRUCTURE(string));
		}
	}

	public SOURCED_FROM(BrainStructure brainStructure) {
		brainStructureList = new ArrayList<BrainStructure>();
		brainStructureList.add(brainStructure);
	}

	@Override
	public BrainStructure getBrainStructure() {
		if(brainStructureList != null && brainStructureList.size() > 0) {
			return brainStructureList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBrainStructure(BrainStructure brainStructure) {
		if(brainStructureList == null) {
			brainStructureList = new ArrayList<>();
		}
		if(brainStructureList.size() == 0) {
			brainStructureList.add(brainStructure);
		} else {
			brainStructureList.set(0, brainStructure);
		}
	}

	@Override
	public List<BrainStructure> getBrainStructureList() {
		return brainStructureList;
	}

	@Override
	public void setBrainStructureList(List<BrainStructure> brainStructureList) {
		this.brainStructureList = brainStructureList;
	}

	@Override
	public boolean hasBrainStructure() {
		return brainStructureList != null && brainStructureList.size() > 0 && brainStructureList.get(0) != null;
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
