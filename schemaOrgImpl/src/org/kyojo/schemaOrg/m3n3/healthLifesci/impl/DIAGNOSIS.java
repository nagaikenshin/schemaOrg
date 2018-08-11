package org.kyojo.schemaOrg.m3n3.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.MedicalCondition;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container;
import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.MEDICAL_CONDITION;

public class DIAGNOSIS implements Container.Diagnosis {

	private static final long serialVersionUID = 1L;

	public List<MedicalCondition> medicalConditionList;

	public DIAGNOSIS() {
	}

	public DIAGNOSIS(String string) {
		this(new MEDICAL_CONDITION(string));
	}

	public String getString() {
		if(medicalConditionList == null || medicalConditionList.size() == 0 || medicalConditionList.get(0) == null) {
			return null;
		} else {
			Name name = medicalConditionList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(medicalConditionList == null) {
			medicalConditionList = new ArrayList<MedicalCondition>();
		}
		if(medicalConditionList.size() == 0) {
			medicalConditionList.add(new MEDICAL_CONDITION(string));
		} else {
			medicalConditionList.set(0, new MEDICAL_CONDITION(string));
		}
	}

	public DIAGNOSIS(MedicalCondition medicalCondition) {
		medicalConditionList = new ArrayList<MedicalCondition>();
		medicalConditionList.add(medicalCondition);
	}

	@Override
	public MedicalCondition getMedicalCondition() {
		if(medicalConditionList != null && medicalConditionList.size() > 0) {
			return medicalConditionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalCondition(MedicalCondition medicalCondition) {
		if(medicalConditionList == null) {
			medicalConditionList = new ArrayList<>();
		}
		if(medicalConditionList.size() == 0) {
			medicalConditionList.add(medicalCondition);
		} else {
			medicalConditionList.set(0, medicalCondition);
		}
	}

	@Override
	public List<MedicalCondition> getMedicalConditionList() {
		return medicalConditionList;
	}

	@Override
	public void setMedicalConditionList(List<MedicalCondition> medicalConditionList) {
		this.medicalConditionList = medicalConditionList;
	}

	@Override
	public boolean hasMedicalCondition() {
		return medicalConditionList != null && medicalConditionList.size() > 0 && medicalConditionList.get(0) != null;
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
