package org.kyojo.schemaorg.m3n4.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalSignOrSymptom;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.MEDICAL_SIGN_OR_SYMPTOM;

import org.seasar.doma.Transient;

public class SIGN_OR_SYMPTOM implements Container.SignOrSymptom {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<MedicalSignOrSymptom> medicalSignOrSymptomList;

	public SIGN_OR_SYMPTOM() {
	}

	public SIGN_OR_SYMPTOM(String string) {
		this(new MEDICAL_SIGN_OR_SYMPTOM(string));
	}

	public String getString() {
		if(medicalSignOrSymptomList == null || medicalSignOrSymptomList.size() == 0 || medicalSignOrSymptomList.get(0) == null) {
			return null;
		} else {
			Name name = medicalSignOrSymptomList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(medicalSignOrSymptomList == null) {
			medicalSignOrSymptomList = new ArrayList<MedicalSignOrSymptom>();
		}
		if(medicalSignOrSymptomList.size() == 0) {
			medicalSignOrSymptomList.add(new MEDICAL_SIGN_OR_SYMPTOM(string));
		} else {
			medicalSignOrSymptomList.set(0, new MEDICAL_SIGN_OR_SYMPTOM(string));
		}
	}

	public SIGN_OR_SYMPTOM(MedicalSignOrSymptom medicalSignOrSymptom) {
		medicalSignOrSymptomList = new ArrayList<MedicalSignOrSymptom>();
		medicalSignOrSymptomList.add(medicalSignOrSymptom);
	}

	@Override
	public MedicalSignOrSymptom getMedicalSignOrSymptom() {
		if(medicalSignOrSymptomList != null && medicalSignOrSymptomList.size() > 0) {
			return medicalSignOrSymptomList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalSignOrSymptom(MedicalSignOrSymptom medicalSignOrSymptom) {
		if(medicalSignOrSymptomList == null) {
			medicalSignOrSymptomList = new ArrayList<>();
		}
		if(medicalSignOrSymptomList.size() == 0) {
			medicalSignOrSymptomList.add(medicalSignOrSymptom);
		} else {
			medicalSignOrSymptomList.set(0, medicalSignOrSymptom);
		}
	}

	@Override
	public List<MedicalSignOrSymptom> getMedicalSignOrSymptomList() {
		return medicalSignOrSymptomList;
	}

	@Override
	public void setMedicalSignOrSymptomList(List<MedicalSignOrSymptom> medicalSignOrSymptomList) {
		this.medicalSignOrSymptomList = medicalSignOrSymptomList;
	}

	@Override
	public boolean hasMedicalSignOrSymptom() {
		return medicalSignOrSymptomList != null && medicalSignOrSymptomList.size() > 0 && medicalSignOrSymptomList.get(0) != null;
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
