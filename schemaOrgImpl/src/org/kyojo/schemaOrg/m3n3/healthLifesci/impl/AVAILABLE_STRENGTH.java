package org.kyojo.schemaOrg.m3n3.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.DrugStrength;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container;
import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.DRUG_STRENGTH;

public class AVAILABLE_STRENGTH implements Container.AvailableStrength {

	private static final long serialVersionUID = 1L;

	public List<DrugStrength> drugStrengthList;

	public AVAILABLE_STRENGTH() {
	}

	public AVAILABLE_STRENGTH(String string) {
		this(new DRUG_STRENGTH(string));
	}

	public String getString() {
		if(drugStrengthList == null || drugStrengthList.size() == 0 || drugStrengthList.get(0) == null) {
			return null;
		} else {
			Name name = drugStrengthList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(drugStrengthList == null) {
			drugStrengthList = new ArrayList<DrugStrength>();
		}
		if(drugStrengthList.size() == 0) {
			drugStrengthList.add(new DRUG_STRENGTH(string));
		} else {
			drugStrengthList.set(0, new DRUG_STRENGTH(string));
		}
	}

	public AVAILABLE_STRENGTH(DrugStrength drugStrength) {
		drugStrengthList = new ArrayList<DrugStrength>();
		drugStrengthList.add(drugStrength);
	}

	@Override
	public DrugStrength getDrugStrength() {
		if(drugStrengthList != null && drugStrengthList.size() > 0) {
			return drugStrengthList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDrugStrength(DrugStrength drugStrength) {
		if(drugStrengthList == null) {
			drugStrengthList = new ArrayList<>();
		}
		if(drugStrengthList.size() == 0) {
			drugStrengthList.add(drugStrength);
		} else {
			drugStrengthList.set(0, drugStrength);
		}
	}

	@Override
	public List<DrugStrength> getDrugStrengthList() {
		return drugStrengthList;
	}

	@Override
	public void setDrugStrengthList(List<DrugStrength> drugStrengthList) {
		this.drugStrengthList = drugStrengthList;
	}

	@Override
	public boolean hasDrugStrength() {
		return drugStrengthList != null && drugStrengthList.size() > 0 && drugStrengthList.get(0) != null;
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
