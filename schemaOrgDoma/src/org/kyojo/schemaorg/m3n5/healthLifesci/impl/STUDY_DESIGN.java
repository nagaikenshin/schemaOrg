package org.kyojo.schemaorg.m3n5.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Container.Name;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalObservationalStudyDesign;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.MEDICAL_OBSERVATIONAL_STUDY_DESIGN;

import org.seasar.doma.Transient;

public class STUDY_DESIGN implements Container.StudyDesign {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<MedicalObservationalStudyDesign> medicalObservationalStudyDesignList;

	public STUDY_DESIGN() {
	}

	public STUDY_DESIGN(String string) {
		this(new MEDICAL_OBSERVATIONAL_STUDY_DESIGN(string));
	}

	public String getString() {
		if(medicalObservationalStudyDesignList == null || medicalObservationalStudyDesignList.size() == 0 || medicalObservationalStudyDesignList.get(0) == null) {
			return null;
		} else {
			Name name = medicalObservationalStudyDesignList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(medicalObservationalStudyDesignList == null) {
			medicalObservationalStudyDesignList = new ArrayList<MedicalObservationalStudyDesign>();
		}
		if(medicalObservationalStudyDesignList.size() == 0) {
			medicalObservationalStudyDesignList.add(new MEDICAL_OBSERVATIONAL_STUDY_DESIGN(string));
		} else {
			medicalObservationalStudyDesignList.set(0, new MEDICAL_OBSERVATIONAL_STUDY_DESIGN(string));
		}
	}

	public STUDY_DESIGN(MedicalObservationalStudyDesign medicalObservationalStudyDesign) {
		medicalObservationalStudyDesignList = new ArrayList<MedicalObservationalStudyDesign>();
		medicalObservationalStudyDesignList.add(medicalObservationalStudyDesign);
	}

	@Override
	public MedicalObservationalStudyDesign getMedicalObservationalStudyDesign() {
		if(medicalObservationalStudyDesignList != null && medicalObservationalStudyDesignList.size() > 0) {
			return medicalObservationalStudyDesignList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalObservationalStudyDesign(MedicalObservationalStudyDesign medicalObservationalStudyDesign) {
		if(medicalObservationalStudyDesignList == null) {
			medicalObservationalStudyDesignList = new ArrayList<>();
		}
		if(medicalObservationalStudyDesignList.size() == 0) {
			medicalObservationalStudyDesignList.add(medicalObservationalStudyDesign);
		} else {
			medicalObservationalStudyDesignList.set(0, medicalObservationalStudyDesign);
		}
	}

	@Override
	public List<MedicalObservationalStudyDesign> getMedicalObservationalStudyDesignList() {
		return medicalObservationalStudyDesignList;
	}

	@Override
	public void setMedicalObservationalStudyDesignList(List<MedicalObservationalStudyDesign> medicalObservationalStudyDesignList) {
		this.medicalObservationalStudyDesignList = medicalObservationalStudyDesignList;
	}

	@Override
	public boolean hasMedicalObservationalStudyDesign() {
		return medicalObservationalStudyDesignList != null && medicalObservationalStudyDesignList.size() > 0 && medicalObservationalStudyDesignList.get(0) != null;
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
