package org.kyojo.schemaorg.m3n3.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Container.Name;
import org.kyojo.schemaorg.m3n3.healthLifesci.Clazz.MedicalEvidenceLevel;
import org.kyojo.schemaorg.m3n3.healthLifesci.Container;
import org.kyojo.schemaorg.m3n3.healthLifesci.impl.MEDICAL_EVIDENCE_LEVEL;

public class EVIDENCE_LEVEL implements Container.EvidenceLevel {

	private static final long serialVersionUID = 1L;

	public List<MedicalEvidenceLevel> medicalEvidenceLevelList;

	public EVIDENCE_LEVEL() {
	}

	public EVIDENCE_LEVEL(String string) {
		this(new MEDICAL_EVIDENCE_LEVEL(string));
	}

	public String getString() {
		if(medicalEvidenceLevelList == null || medicalEvidenceLevelList.size() == 0 || medicalEvidenceLevelList.get(0) == null) {
			return null;
		} else {
			Name name = medicalEvidenceLevelList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(medicalEvidenceLevelList == null) {
			medicalEvidenceLevelList = new ArrayList<MedicalEvidenceLevel>();
		}
		if(medicalEvidenceLevelList.size() == 0) {
			medicalEvidenceLevelList.add(new MEDICAL_EVIDENCE_LEVEL(string));
		} else {
			medicalEvidenceLevelList.set(0, new MEDICAL_EVIDENCE_LEVEL(string));
		}
	}

	public EVIDENCE_LEVEL(MedicalEvidenceLevel medicalEvidenceLevel) {
		medicalEvidenceLevelList = new ArrayList<MedicalEvidenceLevel>();
		medicalEvidenceLevelList.add(medicalEvidenceLevel);
	}

	@Override
	public MedicalEvidenceLevel getMedicalEvidenceLevel() {
		if(medicalEvidenceLevelList != null && medicalEvidenceLevelList.size() > 0) {
			return medicalEvidenceLevelList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalEvidenceLevel(MedicalEvidenceLevel medicalEvidenceLevel) {
		if(medicalEvidenceLevelList == null) {
			medicalEvidenceLevelList = new ArrayList<>();
		}
		if(medicalEvidenceLevelList.size() == 0) {
			medicalEvidenceLevelList.add(medicalEvidenceLevel);
		} else {
			medicalEvidenceLevelList.set(0, medicalEvidenceLevel);
		}
	}

	@Override
	public List<MedicalEvidenceLevel> getMedicalEvidenceLevelList() {
		return medicalEvidenceLevelList;
	}

	@Override
	public void setMedicalEvidenceLevelList(List<MedicalEvidenceLevel> medicalEvidenceLevelList) {
		this.medicalEvidenceLevelList = medicalEvidenceLevelList;
	}

	@Override
	public boolean hasMedicalEvidenceLevel() {
		return medicalEvidenceLevelList != null && medicalEvidenceLevelList.size() > 0 && medicalEvidenceLevelList.get(0) != null;
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
