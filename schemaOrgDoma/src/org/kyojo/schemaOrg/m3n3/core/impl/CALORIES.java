package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Energy;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

import org.seasar.doma.Transient;

public class CALORIES implements Container.Calories {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<Energy> energyList;

	public CALORIES() {
	}

	public CALORIES(String string) {
		this(new ENERGY(string));
	}

	public String getString() {
		if(energyList == null || energyList.size() == 0 || energyList.get(0) == null) {
			return null;
		} else {
			Name name = energyList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(energyList == null) {
			energyList = new ArrayList<Energy>();
		}
		if(energyList.size() == 0) {
			energyList.add(new ENERGY(string));
		} else {
			energyList.set(0, new ENERGY(string));
		}
	}

	public CALORIES(Energy energy) {
		energyList = new ArrayList<Energy>();
		energyList.add(energy);
	}

	@Override
	public Energy getEnergy() {
		if(energyList != null && energyList.size() > 0) {
			return energyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEnergy(Energy energy) {
		if(energyList == null) {
			energyList = new ArrayList<>();
		}
		if(energyList.size() == 0) {
			energyList.add(energy);
		} else {
			energyList.set(0, energy);
		}
	}

	@Override
	public List<Energy> getEnergyList() {
		return energyList;
	}

	@Override
	public void setEnergyList(List<Energy> energyList) {
		this.energyList = energyList;
	}

	@Override
	public boolean hasEnergy() {
		return energyList != null && energyList.size() > 0 && energyList.get(0) != null;
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
