package org.kyojo.schemaorg.m3n3.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Container.Name;
import org.kyojo.schemaorg.m3n3.healthLifesci.Clazz.MedicalSign;
import org.kyojo.schemaorg.m3n3.healthLifesci.Container;
import org.kyojo.schemaorg.m3n3.healthLifesci.impl.MEDICAL_SIGN;

public class SIGN_DETECTED implements Container.SignDetected {

	private static final long serialVersionUID = 1L;

	public List<MedicalSign> medicalSignList;

	public SIGN_DETECTED() {
	}

	public SIGN_DETECTED(String string) {
		this(new MEDICAL_SIGN(string));
	}

	public String getString() {
		if(medicalSignList == null || medicalSignList.size() == 0 || medicalSignList.get(0) == null) {
			return null;
		} else {
			Name name = medicalSignList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(medicalSignList == null) {
			medicalSignList = new ArrayList<MedicalSign>();
		}
		if(medicalSignList.size() == 0) {
			medicalSignList.add(new MEDICAL_SIGN(string));
		} else {
			medicalSignList.set(0, new MEDICAL_SIGN(string));
		}
	}

	public SIGN_DETECTED(MedicalSign medicalSign) {
		medicalSignList = new ArrayList<MedicalSign>();
		medicalSignList.add(medicalSign);
	}

	@Override
	public MedicalSign getMedicalSign() {
		if(medicalSignList != null && medicalSignList.size() > 0) {
			return medicalSignList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalSign(MedicalSign medicalSign) {
		if(medicalSignList == null) {
			medicalSignList = new ArrayList<>();
		}
		if(medicalSignList.size() == 0) {
			medicalSignList.add(medicalSign);
		} else {
			medicalSignList.set(0, medicalSign);
		}
	}

	@Override
	public List<MedicalSign> getMedicalSignList() {
		return medicalSignList;
	}

	@Override
	public void setMedicalSignList(List<MedicalSign> medicalSignList) {
		this.medicalSignList = medicalSignList;
	}

	@Override
	public boolean hasMedicalSign() {
		return medicalSignList != null && medicalSignList.size() > 0 && medicalSignList.get(0) != null;
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
