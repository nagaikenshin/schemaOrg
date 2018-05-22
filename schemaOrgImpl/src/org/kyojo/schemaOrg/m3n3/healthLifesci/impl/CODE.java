package org.kyojo.schemaOrg.m3n3.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.MedicalCode;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container;
import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.MEDICAL_CODE;

public class CODE implements Container.Code {

	private static final long serialVersionUID = 1L;

	public List<MedicalCode> medicalCodeList;

	public CODE() {
	}

	public CODE(String string) {
		this(new MEDICAL_CODE(string));
	}

	public String getString() {
		if(medicalCodeList == null || medicalCodeList.size() == 0 || medicalCodeList.get(0) == null) {
			return null;
		} else {
			Name name = medicalCodeList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(medicalCodeList == null) {
			medicalCodeList = new ArrayList<MedicalCode>();
		}
		if(medicalCodeList.size() == 0) {
			medicalCodeList.add(new MEDICAL_CODE(string));
		} else {
			medicalCodeList.set(0, new MEDICAL_CODE(string));
		}
	}

	public CODE(MedicalCode medicalCode) {
		medicalCodeList = new ArrayList<MedicalCode>();
		medicalCodeList.add(medicalCode);
	}

	@Override
	public MedicalCode getMedicalCode() {
		if(medicalCodeList != null && medicalCodeList.size() > 0) {
			return medicalCodeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalCode(MedicalCode medicalCode) {
		if(medicalCodeList == null) {
			medicalCodeList = new ArrayList<>();
		}
		if(medicalCodeList.size() == 0) {
			medicalCodeList.add(medicalCode);
		} else {
			medicalCodeList.set(0, medicalCode);
		}
	}

	@Override
	public List<MedicalCode> getMedicalCodeList() {
		return medicalCodeList;
	}

	@Override
	public void setMedicalCodeList(List<MedicalCode> medicalCodeList) {
		this.medicalCodeList = medicalCodeList;
	}

	@Override
	public boolean hasMedicalCode() {
		return medicalCodeList != null && medicalCodeList.size() > 0 && medicalCodeList.get(0) != null;
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
