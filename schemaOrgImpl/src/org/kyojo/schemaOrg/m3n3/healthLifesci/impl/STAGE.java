package org.kyojo.schemaOrg.m3n3.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.MedicalConditionStage;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container;
import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.MEDICAL_CONDITION_STAGE;

public class STAGE implements Container.Stage {

	private static final long serialVersionUID = 1L;

	public List<MedicalConditionStage> medicalConditionStageList;

	public STAGE() {
	}

	public STAGE(String string) {
		this(new MEDICAL_CONDITION_STAGE(string));
	}

	public String getString() {
		if(medicalConditionStageList == null || medicalConditionStageList.size() == 0 || medicalConditionStageList.get(0) == null) {
			return null;
		} else {
			Name name = medicalConditionStageList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(medicalConditionStageList == null) {
			medicalConditionStageList = new ArrayList<MedicalConditionStage>();
		}
		if(medicalConditionStageList.size() == 0) {
			medicalConditionStageList.add(new MEDICAL_CONDITION_STAGE(string));
		} else {
			medicalConditionStageList.set(0, new MEDICAL_CONDITION_STAGE(string));
		}
	}

	public STAGE(MedicalConditionStage medicalConditionStage) {
		medicalConditionStageList = new ArrayList<MedicalConditionStage>();
		medicalConditionStageList.add(medicalConditionStage);
	}

	@Override
	public MedicalConditionStage getMedicalConditionStage() {
		if(medicalConditionStageList != null && medicalConditionStageList.size() > 0) {
			return medicalConditionStageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalConditionStage(MedicalConditionStage medicalConditionStage) {
		if(medicalConditionStageList == null) {
			medicalConditionStageList = new ArrayList<>();
		}
		if(medicalConditionStageList.size() == 0) {
			medicalConditionStageList.add(medicalConditionStage);
		} else {
			medicalConditionStageList.set(0, medicalConditionStage);
		}
	}

	@Override
	public List<MedicalConditionStage> getMedicalConditionStageList() {
		return medicalConditionStageList;
	}

	@Override
	public void setMedicalConditionStageList(List<MedicalConditionStage> medicalConditionStageList) {
		this.medicalConditionStageList = medicalConditionStageList;
	}

	@Override
	public boolean hasMedicalConditionStage() {
		return medicalConditionStageList != null && medicalConditionStageList.size() > 0 && medicalConditionStageList.get(0) != null;
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
