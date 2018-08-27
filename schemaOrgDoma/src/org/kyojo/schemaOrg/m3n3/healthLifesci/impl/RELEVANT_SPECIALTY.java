package org.kyojo.schemaorg.m3n3.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Container.Name;
import org.kyojo.schemaorg.m3n3.healthLifesci.Clazz.MedicalSpecialty;
import org.kyojo.schemaorg.m3n3.healthLifesci.Container;
import org.kyojo.schemaorg.m3n3.healthLifesci.impl.MEDICAL_SPECIALTY;

import org.seasar.doma.Transient;

public class RELEVANT_SPECIALTY implements Container.RelevantSpecialty {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<MedicalSpecialty> medicalSpecialtyList;

	public RELEVANT_SPECIALTY() {
	}

	public RELEVANT_SPECIALTY(String string) {
		this(new MEDICAL_SPECIALTY(string));
	}

	public String getString() {
		if(medicalSpecialtyList == null || medicalSpecialtyList.size() == 0 || medicalSpecialtyList.get(0) == null) {
			return null;
		} else {
			Name name = medicalSpecialtyList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(medicalSpecialtyList == null) {
			medicalSpecialtyList = new ArrayList<MedicalSpecialty>();
		}
		if(medicalSpecialtyList.size() == 0) {
			medicalSpecialtyList.add(new MEDICAL_SPECIALTY(string));
		} else {
			medicalSpecialtyList.set(0, new MEDICAL_SPECIALTY(string));
		}
	}

	public RELEVANT_SPECIALTY(MedicalSpecialty medicalSpecialty) {
		medicalSpecialtyList = new ArrayList<MedicalSpecialty>();
		medicalSpecialtyList.add(medicalSpecialty);
	}

	@Override
	public MedicalSpecialty getMedicalSpecialty() {
		if(medicalSpecialtyList != null && medicalSpecialtyList.size() > 0) {
			return medicalSpecialtyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalSpecialty(MedicalSpecialty medicalSpecialty) {
		if(medicalSpecialtyList == null) {
			medicalSpecialtyList = new ArrayList<>();
		}
		if(medicalSpecialtyList.size() == 0) {
			medicalSpecialtyList.add(medicalSpecialty);
		} else {
			medicalSpecialtyList.set(0, medicalSpecialty);
		}
	}

	@Override
	public List<MedicalSpecialty> getMedicalSpecialtyList() {
		return medicalSpecialtyList;
	}

	@Override
	public void setMedicalSpecialtyList(List<MedicalSpecialty> medicalSpecialtyList) {
		this.medicalSpecialtyList = medicalSpecialtyList;
	}

	@Override
	public boolean hasMedicalSpecialty() {
		return medicalSpecialtyList != null && medicalSpecialtyList.size() > 0 && medicalSpecialtyList.get(0) != null;
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
