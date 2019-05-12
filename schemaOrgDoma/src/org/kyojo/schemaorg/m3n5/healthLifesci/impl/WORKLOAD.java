package org.kyojo.schemaorg.m3n5.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.Energy;
import org.kyojo.schemaorg.m3n5.core.Clazz.QualitativeValue;
import org.kyojo.schemaorg.m3n5.core.Container.Name;
import org.kyojo.schemaorg.m3n5.core.impl.ENERGY;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container;

import org.seasar.doma.Transient;

public class WORKLOAD implements Container.Workload {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<Energy> energyList;
	@Transient
	public List<QualitativeValue> qualitativeValueList;

	public WORKLOAD() {
	}

	public WORKLOAD(String string) {
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

	public WORKLOAD(Energy energy) {
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

	public WORKLOAD(QualitativeValue qualitativeValue) {
		qualitativeValueList = new ArrayList<QualitativeValue>();
		qualitativeValueList.add(qualitativeValue);
	}

	@Override
	public QualitativeValue getQualitativeValue() {
		if(qualitativeValueList != null && qualitativeValueList.size() > 0) {
			return qualitativeValueList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setQualitativeValue(QualitativeValue qualitativeValue) {
		if(qualitativeValueList == null) {
			qualitativeValueList = new ArrayList<>();
		}
		if(qualitativeValueList.size() == 0) {
			qualitativeValueList.add(qualitativeValue);
		} else {
			qualitativeValueList.set(0, qualitativeValue);
		}
	}

	@Override
	public List<QualitativeValue> getQualitativeValueList() {
		return qualitativeValueList;
	}

	@Override
	public void setQualitativeValueList(List<QualitativeValue> qualitativeValueList) {
		this.qualitativeValueList = qualitativeValueList;
	}

	@Override
	public boolean hasQualitativeValue() {
		return qualitativeValueList != null && qualitativeValueList.size() > 0 && qualitativeValueList.get(0) != null;
	}

	public WORKLOAD(List<Energy> energyList,
			List<QualitativeValue> qualitativeValueList) {
		setEnergyList(energyList);
		setQualitativeValueList(qualitativeValueList);
	}

	public void copy(Container.Workload org) {
		setEnergyList(org.getEnergyList());
		setQualitativeValueList(org.getQualitativeValueList());
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
